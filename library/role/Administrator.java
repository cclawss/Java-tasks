package com.company.library.role;

import com.company.library.Book;
import com.company.library.User;

public interface Administrator {
    void overdueNotification(Reader reader);

    void findBook(Book book);

    void giveBook(Book book, Reader reader);
}
