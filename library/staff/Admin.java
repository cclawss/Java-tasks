package com.company.library.staff;

import com.company.library.Book;
import com.company.library.User;
import com.company.library.role.Administrator;
import com.company.library.role.Librarian;
import com.company.library.role.Reader;

public class Admin extends User implements Administrator,Reader {
    String name;

    public Admin(String name) {
        this.name = name;
    }


    @Override
    public void overdueNotification(Reader reader) {
        doWork();
        System.out.println("Уведомляет о просрочках клиента");
    }

    @Override
    public void findBook(Book book) {
        doWork();
        System.out.println("Ищёт книгу" + book.getName());
    }

    @Override
    public void giveBook(Book book, Reader reader) {
        System.out.println("Выдаёт книгу" + book.getName() + " для " + reader.getName());
    }


    @Override
    public void doWork() {
        System.out.print("Администратор ");
        super.doWork();
    }


    @Override
    public void takeBook(Book book, Librarian librarian) {
        doWork();
        System.out.println("Взял книгу " + book.getName() + " у "+ librarian.getName());
    }

    @Override
    public void returnBook(Book book, Librarian librarian) {
        doWork();
        System.out.println("Вернул книгу");
    }

    @Override
    public String getName() {
        return name;
    }
}
