//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda, Gora, Seve
//Вывести имя каждого второго и пятого в одном цикле.


package com.blockwit.learn1.romannau;

public class Task8 {
    public static void main(String[] args) {
        //0       1     2       3           4       5       6       7       8       9       10
        String[] Names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon", "Zelda", "Gora", "Seve"};
        for (int i = 0; i < Names.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(Names[i]);
            } else {
                if ((i + 1) % 5 == 0) {
                    System.out.println(Names[i]);
                }
            }
        }
    }
}
