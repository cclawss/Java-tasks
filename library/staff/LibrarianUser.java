package com.company.library.staff;

import com.company.library.Book;
import com.company.library.User;
import com.company.library.role.Administrator;
import com.company.library.role.BookSupplier;
import com.company.library.role.Librarian;
import com.company.library.role.Reader;

public class LibrarianUser extends User implements Librarian, Reader, Administrator {
    String name;

    public LibrarianUser(String name) {
        this.name = name;
    }

    @Override
    public void orderBook(BookSupplier bookSupplier, Book book) {
        doWork();
        System.out.println("Заказал нужные книги у поставщика");
    }

    @Override
    public void takeBook(Book book, Librarian librarian) {
        doWork();
        System.out.println("Взял книгу " + book.getName() + " у " + librarian.getName());

    }

    @Override
    public void returnBook(Book book, Librarian librarian) {
        doWork();
        System.out.println("Вернул книгу " + book.getName() + " " + librarian.getName());
    }

    public String getName() {
        return name;
    }


    @Override
    public void doWork() {
        System.out.print("Библиотекарь ");
        super.doWork();
    }



    @Override
    public void overdueNotification(Reader reader) {
        doWork();
        System.out.println("Уведомляет о просрочках клиента");
    }

    @Override
    public void findBook(Book book) {
        doWork();
        System.out.println("Ищёт книгу " + book.getName());
    }

    @Override
    public void giveBook(Book book, Reader reader) {
        doWork();
        System.out.println("Выдаёт книгу " + book.getName() + " для " + reader.getName());
    }

}
