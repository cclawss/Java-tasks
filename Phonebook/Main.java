package com.company.Phonebook;

import java.util.Scanner;

public class Main {
    public static String nameGroup;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа справочник");
        while (true){
            System.out.println("Создать группу (введите название или введите нет)?");
            nameGroup = scanner.nextLine();
            if (nameGroup.equals("нет")){
                break;
            }
            PhoneContacts.addGroup(nameGroup);
        }
        while (true){
            System.out.println("Создать контакт (введите наименование и его номер или введите нет)?");
            String contactName = scanner.nextLine();
            if (contactName.equals("нет")){
                PhoneContacts.printContact();
                break;
            }
            long contactPhone = scanner.nextLong();
            scanner.nextLine();
            Contact contact = new Contact(contactName,contactPhone);
            System.out.println("Укажите группы контакта через пробел");
            nameGroup = scanner.nextLine();
            String[] nameGroups = nameGroup.split(" ");
            PhoneContacts.addContact(nameGroups,contact);
        }
    }
}
