package com.company.Phonebook;

import java.util.Objects;

public class Contact {
    private final String name;
    private long number;

    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Имя: '" + name + '\'' +
                ", Номер:" + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return number == contact.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
