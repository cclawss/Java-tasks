package com.company.AccessСheck;

import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("Nik", "nik@gmail.com", "123", 20);
        User user3 = new User("James", "james1990@gmail.com", "qq55", 30);
        User user4 = new User("mia", "miiia@gmail.com", "mia11", 15);
        return new User[]{user1, user2, user3, user4,};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.age < 18) {
            throw new AccessDeniedException("You are under 18 years old");
        }
    }

    public static void main(String[] args) throws UserNotFoundException,AccessDeniedException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        validateUser(getUserByLoginAndPassword(login,password));
        System.out.println("Доступ представлен");
    }
}
