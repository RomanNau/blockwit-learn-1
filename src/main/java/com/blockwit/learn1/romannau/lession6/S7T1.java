//Есть два массива чисел. Первый - 9,1,5,6,8. И второй 7,3,1. Вывести их на экран.
// Затем создать такой массив, который бы умещал первые два.
// И скопировать туда элементы первых двух массивов.
// Вывести получный массив на экран.


package com.blockwit.learn1.romannau.lession6;

import com.blockwit.learn1.romannau.Helper;


public class S7T1 {
    public static void main(String[] args) {

        Helper obiects7t1 = new Helper();
        int[] massivA = {9, 1, 5, 6, 8};
        int[] massivB = {7, 3, 1};
        obiects7t1.printArray(massivA);
        System.out.print("\n");
        obiects7t1.printArray(massivB);
        System.out.print("\n");

        int[] num = new int[8];
        for (int k = 0; k < num.length; k++) {
            if (k < massivA.length) {
                num[k] = massivA[k];                  //num[] = 9, 1, 5, 6, 8
            } else  {
                num[k] = massivB[k - 5];
            }                                 //      0  1  2  3  4

        }
        obiects7t1.printArray(num);
    }
}

