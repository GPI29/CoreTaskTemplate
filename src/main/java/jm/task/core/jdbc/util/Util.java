package jm.task.core.jdbc.util;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class Util {
    public static final String NAME_USER = "root";
    public static final String PASSWORD = "kp0kyc89ufsin";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static Connection connection;

    static {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, NAME_USER, PASSWORD);

            if (!connection.isClosed()) {
                System.out.println("Соединение с базой данных установлено");
            }

            //connection.close();
            //if (connection.isClosed()) {
            //    System.out.println("Соединение с базой данных закрыто");
            //}

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}