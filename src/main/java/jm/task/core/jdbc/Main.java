package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        System.out.println("Веедите номер операции, которую необходимо совершить:");
        System.out.println("1: добавление пользователя");
        System.out.println("2: отчистка таблицы пользователей");
        System.out.println("3: вывод всех пользователей в таблице");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Ввведите Имя");
                String name = scanner.next();
                System.out.println("Ввведите Фамилию");
                String lastName = scanner.next();
                System.out.println("Ввведите Возраст");
                byte age = scanner.nextByte();
                userService.saveUser(name, lastName, age);
                break;

            case 2:
                userService.cleanUsersTable();
                break;

            case 3:
                System.out.println(userService.getAllUsers());
                break;
        }
    }
}
