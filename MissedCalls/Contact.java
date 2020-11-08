package com.company.MissedCalls;

public class Contact {
    private String Name;
    private String Surname;
    private String Phone;
    private Enum Group;

    public Contact(String name, String surname, String phone, Enum group) {
        Name = name;
        Surname = surname;
        Phone = phone;
        Group = group;
    }

    @Override
    public String toString() {
        return "Контакты: " +
                "Имя: " + Name +
                ", Фамилия: " + Surname +
                ", Номер: " + Phone +
                ", Группа: " + Group + "\n";
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Enum getGroup() {
        return Group;
    }

    public void setGroup(Enum group) {
        Group = group;
    }
}
