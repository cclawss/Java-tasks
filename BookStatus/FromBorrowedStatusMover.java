package com.company.BookStatus;

public class FromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.BORROWED || book.getStatus() == null) {
            if (requestedStatus == Status.AVAILABLE || requestedStatus == Status.ARCHIVED || requestedStatus == Status.BORROWED) {
                System.out.println("Книга переведена из статуса - " + book.getStatus() + " в статус " + requestedStatus);
                book.setStatus(requestedStatus);
            } else {
                System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
            }
        } else {
            throw new RuntimeException("Выбран неверный перемещатель");
        }
    }
}