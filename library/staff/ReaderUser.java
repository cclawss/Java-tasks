package com.company.library.staff;

import com.company.library.Book;
import com.company.library.User;
import com.company.library.role.Librarian;
import com.company.library.role.Reader;

public class ReaderUser extends User implements Reader {
    private String name;

    public ReaderUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void doWork() {
        System.out.print("Читатель ");
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
        System.out.println("Вернул книгу " + book.getName()+ " "+ librarian.getName());
    }
}
