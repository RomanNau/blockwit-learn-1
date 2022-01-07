//Есть массив данных:
//6,2,8,2,6,2,2,95,34
//Вывести все числа, начиная со второго


package com.blockwit.learn1.romannau;

public class Task25 {
    public static void main(String[] args) {
        int[] array = {6,2,8,2,6,2,2,95,34};
        for(int i = 1; i < array.length; i = i+2) {
            System.out.println(array[i]);
        }
    }
}
