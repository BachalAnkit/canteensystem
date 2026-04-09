package src;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Canteen System =====");
            System.out.println("1. Add Menu Item");
            System.out.println("2. Place Order");
            System.out.println("3. Mark Order Served");
            System.out.println("4. Daily Report");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addMenuItem();
                    break;
                case 2:
                    placeOrder();
                    break;
                case 3:
                    markServed();
                    break;
                case 4:
                    dailyReport();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public static void addMenuItem() {
        try (Connection con = DBConnection.getConnection()) {

            sc.nextLine();
            System.out.print("Enter item name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            String sql = "INSERT INTO menu_items (item_name, price) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, price);

            ps.executeUpdate();
            System.out.println("Item Added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void placeOrder() {
        try (Connection con = DBConnection.getConnection()) {

            sc.nextLine();
            System.out.print("Enter student name: ");
            String student = sc.nextLine();

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM menu_items");

            System.out.println("Menu:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " Rs" + rs.getDouble(3));
            }

            System.out.print("Enter item ID: ");
            int id = sc.nextInt();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            String sql = "INSERT INTO orders (student, item_id, quantity) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, student);
            ps.setInt(2, id);
            ps.setInt(3, qty);

            ps.executeUpdate();
            System.out.println("Order Placed!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void markServed() {
        try (Connection con = DBConnection.getConnection()) {

            System.out.print("Enter Order ID: ");
            int id = sc.nextInt();

            String sql = "UPDATE orders SET served = TRUE WHERE order_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Order Served!");
            else
                System.out.println("Not Found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dailyReport() {
        try (Connection con = DBConnection.getConnection()) {

            String rev = "SELECT SUM(m.price * o.quantity) FROM orders o JOIN menu_items m ON o.item_id = m.item_id";
            ResultSet rs1 = con.createStatement().executeQuery(rev);

            if (rs1.next())
                System.out.println("Revenue: Rs " + rs1.getDouble(1));

            String top = "SELECT m.item_name, SUM(o.quantity) total FROM orders o JOIN menu_items m ON o.item_id=m.item_id GROUP BY m.item_name ORDER BY total DESC LIMIT 1";
            ResultSet rs2 = con.createStatement().executeQuery(top);

            if (rs2.next())
                System.out.println("Top Item: " + rs2.getString(1) + " (" + rs2.getInt(2) + ")");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}