package com.company.library.role;

import com.company.library.Book;

public interface Librarian {
    void orderBook(BookSupplier bookSupplier, Book book);

    String getName();
}
