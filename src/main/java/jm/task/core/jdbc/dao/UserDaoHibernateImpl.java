package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.*;
import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
private SessionFactory sessionFactory;

    public UserDaoHibernateImpl() {
        sessionFactory = Util.getGetSessionFactory();
    }

    @Override
    public void createUsersTable(String nameTable) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query sql = session.createSQLQuery("CREATE TABLE IF NOT EXISTS " + "test." + nameTable + " (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(45), lastName VARCHAR(45), age INT)");
            sql.executeUpdate();
            System.out.println("Таблица " + nameTable + " создана");
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Ошибка при создании таблицы");
        }
        finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void dropUsersTable(String nameTable) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query sql = session.createSQLQuery("DROP TABLE " + "test." + nameTable);
            sql.executeUpdate();
            System.out.println("Таблица " + nameTable + " удалена");
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("Таблица не найдена");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            User user = new User();
            user.setName(name);
            user.setLastName(lastName);
            user.setAge(age);

            session.save(user);
            session.getTransaction().commit();
            System.out.println("Добавлен пользователь с именем: " + name);

        } catch (Exception e) {
            System.out.println("Не вернно введены данные");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void removeUserById(long id) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

            User user = new User();
            user.setId(id);
            session.delete(user);
            session.saveOrUpdate(user);
            session.getTransaction().commit();
            System.out.println("Удален пользователь с именем: " + id);

        } catch (Exception e) {
            System.out.println("Пользователь не найден");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<User> getAllUsers() {

        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(User.class);

            List<User> users = (List<User>) criteria.list();
            session.getTransaction().commit();
            return users;
        } catch (Exception e) {
            System.out.println("Таблица не найдена");
        } finally {
            if (session != null) {
                session.close();
            }
        } return null;
    }

    @Override
    public void cleanUsersTable(String nameTable) {

        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("DELETE FROM " + nameTable);
            query.executeUpdate();
            System.out.println("Таблица отчищена");
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Таблица не найдена");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
