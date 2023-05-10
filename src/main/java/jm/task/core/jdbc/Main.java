package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util worker = new Util();
        Statement statement = null;

        try {
            statement = worker.getConnection().createStatement();
            String query = "CREATE TABLE test.users" +
                    "(id INTEGER not null, " + "name VARCHAR(45), " +
                    "lastName VARCHAR(45), " + "age INTEGER, " + "PRIMARY KEY(id))";
            statement.executeUpdate(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //ResultSet resultSet = statement.executeQuery(query);
            //while (resultSet.next()){
            //    User user = new User();
            //    user.getId(resultSet.getLong(1));
            //    user.getAge(resultSet.getByte(2));
            //    user.getName(resultSet.getString(3));
            //    System.out.println(user);
    }
}
