<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?color=00F7FF&size=28&center=true&vCenter=true&width=700&lines=Java+%2B+MySQL+Project;Canteen+Order+Management+System;JDBC+Console+Application;Built+By+Ankit+Saha" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/JDBC-Connectivity-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Project-DBMS-brightgreen?style=for-the-badge"/>
</p>

---

# 🍽️ Canteen Order Management System

A console-based **Java + MySQL** application to manage canteen operations — including menu management, order placement, order serving, and daily sales reports — all powered by **JDBC connectivity**.

---

## 📌 Features

- ✅ Add menu items with name and price
- ✅ Place orders by selecting items from the live menu
- ✅ Mark orders as served by Order ID
- ✅ View daily revenue and top-selling item report
- ✅ MySQL backend with relational table design
- ✅ Clean console UI with menu-driven navigation

---

## 🗂️ Project Structure

```
canteensystem/
├── lib/
│   └── mysql-connector-j-9.6.0.jar     # MySQL JDBC Driver
├── sql/
│   └── schema.sql                       # Database schema
├── src/
│   ├── DBConnection.java                # Database connection helper
│   └── Main.java                        # Main application logic
├── Screenshots/
│   ├── Screenshot1.png
│   └── Screenshot2.png
└── README.md
```

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| Java (JDK 8+) | Core application logic |
| MySQL | Relational database backend |
| JDBC | Java–MySQL connectivity |
| VS Code | Development environment |

---

## 🗄️ Database Schema

Run the following SQL to set up the database before running the app:

```sql
CREATE DATABASE canteen_db;
USE canteen_db;

CREATE TABLE menu_items (
    item_id   INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100),
    price     DOUBLE
);

CREATE TABLE orders (
    order_id  INT AUTO_INCREMENT PRIMARY KEY,
    student   VARCHAR(100),
    item_id   INT,
    quantity  INT,
    served    BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (item_id) REFERENCES menu_items(item_id)
);
```

> You can also find this in `sql/schema.sql`.

---

## ⚙️ Setup & Run

### Prerequisites

- Java JDK 8 or above installed
- MySQL Server running locally
- `mysql-connector-j-9.6.0.jar` (already included in `lib/`)

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/your-username/canteensystem.git
cd canteensystem
```

**2. Set up the database**
```bash
mysql -u root -p < sql/schema.sql
```

**3. Update DB credentials in `DBConnection.java`**
```java
private static final String URL      = "jdbc:mysql://localhost:3306/canteen_db";
private static final String USER     = "root";
private static final String PASSWORD = "your_password";
```

**4. Compile the project**
```bash
javac -cp ".;lib\mysql-connector-j-9.6.0.jar" src\DBConnection.java src\Main.java
```

**5. Run the application**
```bash
java -cp ".;lib\mysql-connector-j-9.6.0.jar" src.Main
```

> **On Linux/Mac**, replace `;` with `:` in the classpath.

---

## 🖥️ Application Menu

```
===== Canteen System =====
1. Add Menu Item
2. Place Order
3. Mark Order Served
4. Daily Report
5. Exit
```

### Sample Interaction

```
Enter choice: 1
Enter item name: Veg Thali
Enter price: 60.0
Item Added!

Enter choice: 2
Enter student name: Rahul
Menu:
1 Veg Thali Rs60.0
Enter item ID: 1
Enter quantity: 2
Order Placed!

Enter choice: 4
Revenue: Rs 120.0
Top Item: Veg Thali (2)
```

---

## 📸 Screenshots

| Screenshot 1 | Screenshot 2 |
|---|---|
| ![Screenshot1](Screenshots/Screenshot1.png) | ![Screenshot2](Screenshots/Screenshot2.png) |

---

## 🔮 Future Improvements

- [ ] GUI interface using Java Swing or JavaFX
- [ ] Student login / authentication system
- [ ] Export daily report to PDF
- [ ] Admin dashboard with analytics
- [ ] Multi-canteen support

---

## 👨‍💻 Author

**Ankit Saha**

<p align="left">
  <a href="https://github.com/your-username">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white"/>
  </a>
  <a href="https://linkedin.com/in/your-profile">
    <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white"/>
  </a>
</p>

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

<p align="center">Made with ❤️ by Ankit Saha</p>
