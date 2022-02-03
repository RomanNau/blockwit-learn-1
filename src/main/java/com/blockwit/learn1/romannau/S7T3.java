//TaskS7T3
//Есть два массива. Первый 7,4,2,8,6,7 и второй 6,2,9. Вывести их на экран.
// А затем создать такой массив, который вмещал бы первые два. И скопировать в новый массив элементы первых двух массивов.
// При этом элементы из первого и второго массивов должны чередоваться в новом массиве.
// Если в какой-то момент из-за нехватки элементов в одном из массивов чередовать будет нельзя, то копировать элементы из оставшегося массива.
//

package com.blockwit.learn1.romannau;

public class S7T3 {
    public static void main(String[] args) {
        Helper obiects7t3 = new Helper();                                              //i  0  1  2     3 4 5

        int arrayA[] = {7, 4, 2, 8, 6, 7};         //длинный массив 5-последний индекс      7. 4. 2.    8.6.7
        int arrayB[] = {6, 2, 9};              //короткий массив 2-последний индекс         6. 2. 9

        obiects7t3.printArray(arrayA);
        System.out.print("\n");                                                       // I=3 7 6 4 2 2 9 8
        obiects7t3.printArray(arrayB);                                               // I =4 7 6 4 2 2 9 8 6
        System.out.print("\n");                                                      // I=5  7 6 4 2 2 9 8 6 7

                                                                                // num[i]    0 1 2 3 4 5 6 7 8
        int[] num = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < (arrayA.length- arrayB.length) + arrayB.length && arrayA.length > arrayB.length; i++) {
            if ((i + 1) % 2 == 0) {
                num[i] = arrayA[i / 2];
            } else {
                num[i] = arrayB[i / 2];
            }
        }
        for (int k = 3; k < arrayA.length; k++) {
            num[k + arrayB.length] = arrayA[k];

        }
        obiects7t3.printArray(num);
    }
}

