<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Canteen Order Management System</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap" rel="stylesheet">

    <style>
        body {
            margin: 0;
            font-family: 'Poppins', sans-serif;
            background: #0f172a;
            color: white;
            text-align: center;
        }

        h1 {
            font-size: 40px;
            color: #00f7ff;
        }

        .typing {
            color: #00f7ff;
            font-size: 20px;
            margin-bottom: 20px;
        }

        .container {
            width: 80%;
            margin: auto;
            padding: 20px;
        }

        .card {
            background: #1e293b;
            padding: 20px;
            margin: 20px 0;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0,255,255,0.2);
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid #00f7ff;
        }

        th, td {
            padding: 10px;
        }

        th {
            background: #00f7ff;
            color: black;
        }

        .btn {
            display: inline-block;
            padding: 10px 20px;
            background: #00f7ff;
            color: black;
            border-radius: 10px;
            text-decoration: none;
            margin-top: 10px;
        }

        .btn:hover {
            background: #0ea5e9;
        }
    </style>
</head>

<body>

    <div class="container">

        <h1>🍽️ Canteen Order Management System</h1>

        <div class="typing" id="typing"></div>

        <!-- Overview -->
        <div class="card">
            <h2>🚀 Project Overview</h2>
            <p>A real-world Java + MySQL system to manage canteen orders efficiently.</p>
            <ul>
                <li>⏳ Long queue problem solved</li>
                <li>❌ Order confusion reduced</li>
                <li>🍜 Food wastage minimized</li>
            </ul>
        </div>

        <!-- Features -->
        <div class="card">
            <h2>✨ Features</h2>
            <table>
                <tr>
                    <th>Feature</th>
                    <th>Description</th>
                </tr>
                <tr>
                    <td>Add Menu Item</td>
                    <td>Insert food items with price</td>
                </tr>
                <tr>
                    <td>Place Order</td>
                    <td>Students can order items</td>
                </tr>
                <tr>
                    <td>Mark Served</td>
                    <td>Update order status</td>
                </tr>
                <tr>
                    <td>Daily Report</td>
                    <td>Revenue + top item</td>
                </tr>
            </table>
        </div>

        <!-- Tech Stack -->
        <div class="card">
            <h2>🛠️ Tech Stack</h2>
            <table>
                <tr>
                    <th>Layer</th>
                    <th>Technology</th>
                </tr>
                <tr>
                    <td>Language</td>
                    <td>Java</td>
                </tr>
                <tr>
                    <td>Database</td>
                    <td>MySQL</td>
                </tr>
                <tr>
                    <td>Connectivity</td>
                    <td>JDBC</td>
                </tr>
                <tr>
                    <td>Interface</td>
                    <td>Console</td>
                </tr>
            </table>
        </div>

        <!-- Setup -->
        <div class="card">
            <h2>⚙️ Setup Guide</h2>
            <p>1. Clone Repository</p>
            <p>2. Run schema.sql in MySQL</p>
            <p>3. Configure DBConnection.java</p>
            <p>4. Compile and Run</p>
        </div>

        <!-- Author -->
        <div class="card">
            <h2>👨‍💻 Author</h2>
            <p><b>Ankit Saha</b></p>
            <p>Email: ankit.saha2025@iem.edu.in</p>
        </div>

        <!-- Button -->
        <a href="#" class="btn">⭐ Star Project</a>

    </div>

    <!-- Typing Animation Script -->
    <script>
        const text = [
            "Java + MySQL Project",
            "Canteen Order Management System",
            "JDBC Console Application"
        ];

        let i = 0;
        let j = 0;
        let currentText = "";
        let isDeleting = false;

        function type() {
            currentText = text[i];
            
            if (!isDeleting) {
                document.getElementById("typing").innerHTML = currentText.substring(0, j++);
                if (j > currentText.length) {
                    isDeleting = true;
                    setTimeout(type, 1000);
                    return;
                }
            } else {
                document.getElementById("typing").innerHTML = currentText.substring(0, j--);
                if (j == 0) {
                    isDeleting = false;
                    i = (i + 1) % text.length;
                }
            }

            setTimeout(type, isDeleting ? 50 : 100);
        }

        type();
    </script>

</body>
</html>
