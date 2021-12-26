//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda
//Вывести имя каждого третьего.





package com.blockwit.learn1.romannau;

public class Task6 {
    public static void main(String[] args) {
        String[] Names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon", "Zelda"};
        for(int i = 2; i < 9; i = i + 3) {
            System.out.println(Names[i]);
        }
    }
}
