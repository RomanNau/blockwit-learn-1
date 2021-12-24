//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon
//Вывести имя каждого второго.





package com.blockwit.learn1.romannau;

import javax.naming.Name;

public class Task5 {
    public static void main(String[] args) {
        String[] Names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon"};
        for (int i = 1; i < 8; i = i + 2) {
            System.out.println(Names[i]);
        }
    }
}
