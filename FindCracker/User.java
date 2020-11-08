package com.company.FindCracker;

import java.util.Map;
import java.util.TreeMap;

public class User {
    private String id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;

    public User(String id, String surname, String name, String patronymic, String address) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Предпологаемый злоумышленник:\n" +
                name+" "+surname+" "+patronymic+"\n"+
                "Адрес: "+address;
    }

    public String getName() {
        return name;
    }

}
