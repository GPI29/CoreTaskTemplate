package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {

//    private final Connection connection;


    public UserDaoJDBCImpl() {

//        connection = new Util().getConnection();

    }

    public void createUsersTable(String nameTable) throws SQLException {
//        Statement statement = null;
//        try {
//            String sqlCreate = "CREATE TABLE IF NOT EXISTS " + "test." + nameTable + " (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(45), lastName VARCHAR(45), age INT)";
//            statement = connection.createStatement();
//            //System.out.println("Соединение восстановлено");
//            statement.executeUpdate(sqlCreate);
//            System.out.println("Таблица в базе данных создана");
//        } catch (SQLException e) {
//            System.out.println("Таблица в базе данных не создалась");
//        } finally {
//            if (statement != null) {
//                statement.close();
//            }
//        }
    }

    public void dropUsersTable(String nameTable) throws SQLException {
//        Statement statement = null;
//        try {
//            String sqlDropTable = "DROP TABLE " + "test." + nameTable;
//            statement = connection.createStatement();
//            statement.executeUpdate(sqlDropTable);
//            System.out.println("Таблица удалена");
//        } catch (SQLException e) {
//            System.out.println("Таблица не удалена");
//        } finally {
//            if (statement != null) {
//                statement.close();
//            }
//            //if (connection != null) {
//            //    connection.close();
//            //}
//        }
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        try {
//            String sqlSaveUser = "INSERT INTO " + "test." + nameTable + " (name, lastName, age) VALUES (?,?,?)";
//            preparedStatement = connection.prepareStatement(sqlSaveUser);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            System.out.println("Добавлен пользователь с именем: " + name);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Пользователь не добавлен в базу данных");
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//
//        }
    }

    public void removeUserById(long id) throws SQLException {

//        PreparedStatement preparedStatement = null;
//        try {
//            String sqlRemoveUser = "DELETE FROM " + "test." + nameTable + " WHERE ID = ?";
//            preparedStatement = connection.prepareStatement(sqlRemoveUser);
//            preparedStatement.executeUpdate();
//            System.out.println("Пользователь удален");
//        } catch (SQLException e) {
//            System.out.println("Пользователь не удален");
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        try {
//            String sqlAllUsers = "SELECT name, lastName, age FROM " + "test." + nameTable;
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(sqlAllUsers);
//
//            while (resultSet.next()) {
//                users.add(new User(
//                        resultSet.getString("name"),
//                        resultSet.getString("lastName"),
//                        resultSet.getByte("age")
//                ));
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка при выводе пользователей");
//        }
//        return users;
        return null;
    }

    public void cleanUsersTable(String nameTable) throws SQLException {
//        PreparedStatement preparedStatement = null;
//        try {
//            String sqlClearTable = "DELETE FROM " + "test." + nameTable;
//            preparedStatement = connection.prepareStatement(sqlClearTable);
//            preparedStatement.executeUpdate();
//            System.out.println("Таблица отчищена");
//        } catch (SQLException e) {
//            System.out.println("Таблица не отчищена");
//        } finally {
//            if (preparedStatement != null) {
//                preparedStatement.close();
//            }
//
//        }
//    }
    }
}