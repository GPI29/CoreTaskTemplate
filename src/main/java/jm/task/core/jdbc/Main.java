package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

//        Session session=getSession();
//        session.beginTransaction();
//        User user=(User)session.get(User.class, new Integer(1));
//        System.out.println(user.getName());
//        session.close();

        while (true) {
            System.out.println("Веедите номер операции, которую необходимо совершить:");
            System.out.println("1: добавление пользователя");
            System.out.println("2: отчистка таблицы пользователей");
            System.out.println("3: вывод всех пользователей в таблице");
            System.out.println("4: создание таблицы");
            System.out.println("5: удаление таблицы");
            System.out.println("6: выход");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
//                    System.out.println("Ввведите название таблицы, в которую неоходимо добавить пользователя");
//                    String nameTableAdd = scanner.next();
                    System.out.println("Ввведите Имя");
                    String name = scanner.next();
                    System.out.println("Ввведите Фамилию");
                    String lastName = scanner.next();
                    System.out.println("Ввведите Возраст");
                    byte age = scanner.nextByte();
                    userService.saveUser(name, lastName, age);
                    break;

                case 2:
                    System.out.println("Ввведите название таблицы, которую неоходимо отчистить");
                    String nameTableClean = scanner.next();
                    userService.cleanUsersTable(nameTableClean);

                    break;

                case 3:
//                    System.out.println("Ввведите название таблицы откуда вывести пользователей");
//                    String nameTableAllUsers = scanner.next();
                    System.out.println(userService.getAllUsers());
                    break;

                case 4:
                    System.out.println("Ввведите название таблицы, которую необходимо создать");
                    String nameTable = scanner.next();
                    userService.createUsersTable(nameTable);
                    break;

                case 5:
                    System.out.println("Ввведите название таблицы, которую необходимо удалить");
                    String nameTableDrop = scanner.next();
                    userService.dropUsersTable(nameTableDrop);

                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}