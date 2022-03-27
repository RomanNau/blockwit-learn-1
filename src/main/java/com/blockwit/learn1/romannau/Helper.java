//5. Написать в Helper функцию , которая принимает на вход ассоциативный массив из 6 книг , который сделали в 4ой задаче и isbn.
// Функция по isbn должна возвращать книгу из полученного ассоциативного массива.

package com.blockwit.learn1.romannau;

import com.blockwit.learn1.romannau.Lession10.Book;

import java.util.Map;

public class Helper {

    public void printArray(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ",");
        }
    }

    public void printInList(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }
    public Book getBookISBN(Map<Integer, Book> books, int isbn){
        return books.get(isbn);
    }
}
