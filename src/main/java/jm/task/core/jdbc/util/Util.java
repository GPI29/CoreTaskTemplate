package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.sql.*;
import java.util.Properties;

public class Util {

//    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
//    private static final String DB_USER = "root";
//    private static final String DB_PASSWORD = "kp0kyc89ufsin";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";

    private static final SessionFactory sessionFactory;

    static {
        final Properties properties = new Properties();
        properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/mysql");
        properties.setProperty("hibernate.connection.username", "root");
        properties.setProperty("hibernate.connection.password", "kp0kyc89ufsin");
        properties.setProperty("dialect", "com.mysql.cj.jdbc.Driver");
        properties.setProperty("hibernate.connection.driver", "com.mysql.cj.jdbc.Driver");

        sessionFactory = new Configuration()
                .addAnnotatedClass(User.class)
                .addProperties(properties)
                .buildSessionFactory();
    }

    public static SessionFactory getGetSessionFactory(){

        return sessionFactory;
    }

//    public static void shutDown(){
//        getGetSessionFactory().close();
//    }
//
//
//    public static Session getSession() throws HibernateException {
//        return session;
//    }
//
//
//    public static void closeSession() {
//        session.close();
//    }
//
//    public static void closeTransactionSession() {
//        transaction.commit();
//        closeSession();
//    }



//    public Connection getConnection() {
//    Connection connection = null;
//    try {
//        Class.forName(DB_DRIVER);
//        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//        System.out.println("Подключение к базе данных - ОК");
//    } catch (ClassNotFoundException | SQLException e) {
//        e.printStackTrace();
//        System.out.println("Подключение к базе данных - не ОК");
//    }
//        return connection;
//    }


}