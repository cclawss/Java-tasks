package com.company.Phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneContacts {
    private static Object Contact;
    private String groupName;

    public PhoneContacts(String groupName) {
        this.groupName = groupName;
    }

    public static Map<String, Object> phoneBook = new HashMap<String, Object>();

    public static void addGroup(String groupName) {
        phoneBook.put(groupName, Contact);
        System.out.println(phoneBook.toString());

    }

    public static void addContact(String[] groupName, Contact contact) {

        for (int i = 0; i < groupName.length; i++) {
            if (phoneBook.containsKey(groupName[i])) {
                phoneBook.put(groupName[i], contact);
            } else {
                System.out.println("Группа " + groupName[i] + " не создана");
            }
        }
    }

    public static void printContact() {
        for (String s : phoneBook.keySet()) {
            System.out.println("В группе "+s+" находится контакт - "+phoneBook.get(s));
        }
    }
}
