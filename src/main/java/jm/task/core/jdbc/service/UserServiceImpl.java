package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoHibernateImpl();
    }


    public void createUsersTable(String nameTable) throws SQLException {

        userDao.createUsersTable(nameTable);

    }

    public void dropUsersTable(String nameTable) throws SQLException {

        userDao.dropUsersTable(nameTable);

    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {

        userDao.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) throws SQLException {

        userDao.removeUserById(id);

    }

    public List<User> getAllUsers() {

        return userDao.getAllUsers();
    }

    public void cleanUsersTable(String nameTable) throws SQLException {

        userDao.cleanUsersTable(nameTable);

    }
}
