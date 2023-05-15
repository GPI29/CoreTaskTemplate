package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface UserService {

    void createUsersTable(String nameTable) throws SQLException;

    void dropUsersTable(String nameTable) throws SQLException;

    void saveUser(String name, String lastName, byte age) throws SQLException;

    void removeUserById(long id) throws SQLException;

    List<User> getAllUsers();

    void cleanUsersTable(String nameTable) throws SQLException;
}
