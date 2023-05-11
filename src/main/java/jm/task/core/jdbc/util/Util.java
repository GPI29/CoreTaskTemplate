package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "kp0kyc89ufsin";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";

    public Connection getConnection() {
    Connection connection = null;
    try {
        Class.forName(DB_DRIVER);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        System.out.println("Подключение к базе данных - ОК");
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        System.out.println("Подключение к базе данных - не ОК");
    }
        return connection;
    }

}