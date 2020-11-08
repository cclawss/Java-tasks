package com.company.library.staff;

import com.company.library.Book;
import com.company.library.User;
import com.company.library.role.BookSupplier;
import com.company.library.role.Librarian;

public class Supplier extends User implements BookSupplier {

    @Override
    public void doWork() {
        System.out.print("Поставщик книг ");
        super.doWork();
    }

    @Override
    public void bringBook(Book book, Librarian librarian) {
        doWork();
        System.out.println("Доставил книги " + librarian.getName());
    }
}
