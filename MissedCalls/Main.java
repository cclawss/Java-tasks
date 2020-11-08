package com.company.MissedCalls;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void addContact() {
        System.out.println("Введите имя");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        System.out.println("Введите номер");
        String phone = scanner.nextLine();
        Group group = null;
        while (group == null) {
            System.out.println("Введите название группы");
            String groupInput = scanner.nextLine();
            group = Group.getGroup(groupInput);
        }
        Contacts.addContact(name, surname, phone, group);
    }

    public static void addMissCall() {
        System.out.println("Добавьте номер пропущенного вызова: ");
        scanner.nextLine();
        String phone = scanner.nextLine();
        MissedCalls.addMissedCall(phone);
    }

    public static void findByPhoneNumber(){
        System.out.println("Введите номер");
        scanner.nextLine();
        String phone = scanner.nextLine();
        System.out.println(Contacts.searchForAContact(phone));
    }

    public static void deleteContact(){
        System.out.println("Введите имя");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine();
        Contacts.deleteAContact(name, surname);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Добавить контакт\n" +
                    "2. Добавить пропущенный вызов\n" +
                    "3. Вывести все пропущенные вызовы\n" +
                    "4. Очистить пропущенные вызовы\n" +
                    "5. Найти по номеру телефона\n" +
                    "6. Удалить контакт по имени и фамилии\n" +
                    "7. Выход");
            int input = scanner.nextInt();
            switch (input) {
                case (1):
                    addContact();
                    break;
                case (2):
                    addMissCall();
                    break;
                case (3):
                    MissedCalls.showAllMissedCalls();
                    break;
                case (4):
                    MissedCalls.clearMissedCalls();
                    break;
                case (5):
                    findByPhoneNumber();
                    break;
                case (6):
                   deleteContact();
                    break;
                case (7):
                    System.exit(0);
                    break;
            }
        }
    }
}
