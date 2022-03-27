package com.blockwit.learn1.romannau.Lession10;

import java.util.HashMap;
import java.util.Map;

public class LibraryMini {
    public static void main(String[] args){
        Map <Integer, Book> books = new HashMap();

        Book book1 = new Book("Стихи", 123448);
        Book book2 =new Book("Сказки СССР", 453248);
        Book book3 =new Book("Сказки народов мира", 458990);
        Book book4 =new Book("Пушкин, Собрание", 129765);
        Book book5 =new Book("Лермонтов, Избранное", 675544);
        Book book6 =new Book("Толcтой, том 2", 456733);

        books.put(book1.getIsbn(), book1);
        books.put(book2.getIsbn(), book2);
        books.put(book3.getIsbn(), book3);
        books.put(book4.getIsbn(), book4);
        books.put(book5.getIsbn(), book5);
        books.put(book6.getIsbn(), book6);
        System.out.println(book2.getName());

    }
}
