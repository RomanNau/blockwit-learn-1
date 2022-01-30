//tu1
//Написать класс Utils. Внутри него метод sort. Метод sort должен принимать на вход массив чисел.
// Метод сортирует числа внутри массива в порядке возрастания.
//Задан массив чисел 12, 7, 89, -4, 8, 9
//                    0  1   2   3  4  5

package com.blockwit.learn1.romannau;

public class Utils {

    public static void sort(int[] mass){
        for(int i = 0; i < mass.length; i++) {
                int num = mass[i];                                 //7
            for (int j = i - 1; j >= 0; j--) {                 //j=0
                    int leftNum = mass[j];                         // left=12
                    if (num < leftNum) {                           // 7 < 12
                    mass[j + 1] = leftNum;                     // 7 становиться 12
                    mass[j] = num;                             // 12 становиться 7
                    } else {
                    break;                                      // выйти из цикла сравнения
                    }
            }
        }
    }
}
