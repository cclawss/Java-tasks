package com.company.MissedCalls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Contacts {
    static Map<String, Contact> contacts = new HashMap<>();

    public static void addContact(String name, String surname, String phone, Enum group) {
        contacts.put(phone, new Contact(name, surname, phone, group));
        System.out.println("Добавлен.");
    }

    public static void deleteAContact(String name, String surname) {
        long i = 0;
        Iterator<Map.Entry<String, Contact>> it = contacts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Contact> pair = it.next();
            if (pair.getValue().getName().equals(name) && pair.getValue().getSurname().equals(surname)) {
                it.remove();
            }
        }
    }

    public static String searchForAContact(String phone) {

        for (String s : contacts.keySet()) {
            if (s.equals(phone)) {
                return "Имя: " + contacts.get(phone).getName() + ", Фамилия: " + contacts.get(phone).getSurname();
            }
        }
        return "Контакт не найден.";
    }
}
