//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda
//Вывести имя каждого второго.





package com.blockwit.learn1.romannau;

public class Task7 {
    public static void main(String[] args) {
        String[] Names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon", "Zelda"};
                for (int i = 1; i < Names.length; i = i + 2) {
                    System.out.println(Names[i]);
        }

    }
}
