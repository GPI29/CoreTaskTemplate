package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    void createUsersTable(String nameTable) throws SQLException;

    void dropUsersTable(String nameTable) throws SQLException;

    void saveUser(String nameTable, String name, String lastName, byte age) throws SQLException;

    void removeUserById(long id, String nameTable) throws SQLException;

    List<User> getAllUsers(String nameTable);

    void cleanUsersTable(String nameTable) throws SQLException;
}
