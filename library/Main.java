package com.company.library;

import com.company.library.staff.Admin;
import com.company.library.staff.LibrarianUser;
import com.company.library.staff.ReaderUser;
import com.company.library.staff.Supplier;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Белый Клык", 1906);
        Admin admin = new Admin("Admin");
        LibrarianUser librarianUser1 = new LibrarianUser("Andrey");
        LibrarianUser librarianUser2 = new LibrarianUser("Alex");
        ReaderUser readerUser = new ReaderUser("User1");
        Supplier supplier = new Supplier();

        readerUser.takeBook(book, librarianUser1);
        librarianUser1.findBook(book);
        librarianUser1.giveBook(book, readerUser);
        readerUser.returnBook(book, librarianUser1);
    }
}
