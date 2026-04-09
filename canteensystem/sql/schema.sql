CREATE DATABASE canteen_db;
USE canteen_db;

CREATE TABLE menu_items (
    item_id INT PRIMARY KEY AUTO_INCREMENT,
    item_name VARCHAR(100),
    price DECIMAL(6,2)
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    student VARCHAR(100),
    item_id INT,
    quantity INT DEFAULT 1,
    ordered_at DATETIME DEFAULT NOW(),
    served BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (item_id) REFERENCES menu_items(item_id)
);