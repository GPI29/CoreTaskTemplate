package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoJDBCImpl();
    }


    public void createUsersTable(String nameTable) throws SQLException {

        userDao.createUsersTable(nameTable);

    }

    public void dropUsersTable(String nameTable) throws SQLException {

        userDao.dropUsersTable(nameTable);

    }

    public void saveUser(String nameTable, String name, String lastName, byte age) throws SQLException {

        userDao.saveUser(nameTable ,name, lastName, age);

    }

    public void removeUserById(long id, String nameTable) throws SQLException {

        userDao.removeUserById(id, nameTable);

    }

    public List<User> getAllUsers(String nameTable) {

        return userDao.getAllUsers(nameTable);
    }

    public void cleanUsersTable(String nameTable) throws SQLException {

        userDao.cleanUsersTable(nameTable);

    }
}
