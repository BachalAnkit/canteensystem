<p align="center"> <img src="https://readme-typing-svg.herokuapp.com?color=00F7FF&size=28&center=true&vCenter=true&width=800&lines=Java+%2B+MySQL+Project;Canteen+Order+Management+System;JDBC+Console+Application;Real+World+DBMS+Project;Built+By+Ankit+Saha" /> </p>
<p align="center"> <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/> <img src="https://img.shields.io/badge/MySQL-00758F?style=for-the-badge&logo=mysql&logoColor=white"/> <img src="https://img.shields.io/badge/JDBC-Connectivity-blue?style=for-the-badge"/> <img src="https://img.shields.io/badge/Project-DBMS-brightgreen?style=for-the-badge"/> </p>
🚀 Project Overview

The Canteen Order Management System is a real-world Java + MySQL (JDBC) project designed to automate canteen operations.

🔥 Problems Solved
⏳ Long queues
❌ Order confusion
🍜 Food wastage
🎥 Project Preview
<p align="center"> <img src="https://media.giphy.com/media/3o7aD2saalBwwftBIY/giphy.gif" width="600"/> </p>
🎯 Objectives
🎯 Goal	📌 Description
Automation	Digitize canteen operations
Tracking	Manage student orders efficiently
Optimization	Reduce food wastage
Insights	Generate daily reports
✨ Features
Feature	Description
🧾 Add Menu Item	Insert food items with price
🛒 Place Order	Students can order items
✅ Mark Served	Update order status
📊 Daily Report	Revenue + Top item
🛠️ Tech Stack
Layer	Technology
💻 Language	Java
🗄️ Database	MySQL
🔗 Connectivity	JDBC
🖥️ Interface	Console
📂 Project Structure
canteen-system/
│
├── src/
│   ├── Main.java
│   └── DBConnection.java
│
├── schema.sql
└── README.md
🗄️ Database Schema
📌 menu_items
CREATE TABLE menu_items (
    item_id INT PRIMARY KEY AUTO_INCREMENT,
    item_name VARCHAR(100),
    price DECIMAL(6,2)
);
📌 orders
CREATE TABLE orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    student VARCHAR(100),
    item_id INT,
    quantity INT DEFAULT 1,
    ordered_at DATETIME DEFAULT NOW(),
    served BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (item_id) REFERENCES menu_items(item_id)
);
⚙️ Setup Guide
🔽 Clone Repository
git clone https://github.com/your-username/canteen-order-management-system.git
cd canteen-order-management-system
🗄️ Setup Database
SOURCE schema.sql;
🔐 Configure Database
static final String URL = "jdbc:mysql://localhost:3306/canteen_db";
static final String USER = "your_username";
static final String PASSWORD = "your_password";
▶️ Run Project
javac src/*.java
java src.Main
🖥️ Console Interface
===== Canteen System =====
1. Add Menu Item
2. Place Order
3. Mark Order Served
4. Daily Report
5. Exit
📊 Output Example
Item Added!
Order Placed!
Order Served!
Revenue: Rs 500
Top Item: Noodles (12)
🧠 Learning Outcomes
Skill	Description
JDBC	Database connectivity
SQL	Joins & aggregation
Java	OOP & exception handling
DBMS	Real-world system design
🔮 Future Enhancements
🌐 Web-based system
📱 Mobile app
📊 Admin dashboard
🤖 Smart prediction
👨‍💻 Author
<p align="center"> <img src="https://img.shields.io/badge/Ankit_Saha-Developer-blue?style=for-the-badge"/> </p>

📧 ankit.saha2025@iem.edu.in

⭐ Support

If you like this project:

⭐ Star the repo
🍴 Fork it
🤝 Contribute
💬 Quote
<p align="center"> <img src="https://readme-typing-svg.herokuapp.com?color=F70000&size=20&center=true&vCenter=true&width=700&lines=A+database+is+the+memory+of+your+application" /> </p>
