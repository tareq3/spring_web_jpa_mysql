package com.mti.spring_web_jpa_mysql.utility;

public class BookNotFoundException extends Exception{
    private long book_id;

    public BookNotFoundException(long book_id) {
      super(String.format("Book is not found with id: '%s'", book_id));
    }
}
