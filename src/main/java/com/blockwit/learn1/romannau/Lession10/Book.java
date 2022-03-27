package com.blockwit.learn1.romannau.Lession10;

public class Book {
    String name;
    int isbn;
    public Book(String name, int isbn) {
        this.name=name;
        this.isbn=isbn;
    }

    public Book() {

    }

    public String getName(){
        return name;
    }

    public int getIsbn() {
        return isbn;
    }
}
