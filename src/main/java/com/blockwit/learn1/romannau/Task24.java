//Есть массив данных:
//65,43,90,123,436,54
//Вывести 4 числа с конца



package com.blockwit.learn1.romannau;

public class Task24 {
    public static void main(String[] args) {
        int[] array = {65,43,90,123,436,54};
        for(int i = 5; i > 1; i--) {
            System.out.println(array[i]);
        }
    }
}
