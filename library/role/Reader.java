package com.company.library.role;

import com.company.library.Book;

public interface Reader {
    void takeBook(Book book, Librarian librarian);

    void returnBook(Book book, Librarian librarian);

    String getName();
}
