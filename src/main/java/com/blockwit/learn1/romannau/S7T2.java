//Есть два массива. Первый 6,3,8,9 и второй 0,3,1,5. Вывести их на экран.
// А затем создать такой массив, который вмещал бы первые два.
// И скопировть в новый массив элементы первых двух массивов.
// При этом элементы из первого и второго массивов должны чередоваться в новом массиве.

package com.blockwit.learn1.romannau;

public class S7T2 {
    public static void main(String[] args){
        Helper obiects7t2 = new Helper();
        int[] massivA = {6,3,8,9}; //четный                               // 6, 0, 3, 3, 8, 1, 9, 5
                                                                          // 0  1  2  3  4  5  6  7
        int[] massivB = {0,3,1,5};  //нечетный

        int[] num = new int[massivA.length + massivB.length];
        for(int i = 0; i < num.length; i++){
            if( (i + 1) % 2 == 0 ) {
                num[i] = massivA[i/2];
            } else {
                num[i] = massivB[i/2];

            }
        }
        obiects7t2.printArray(num);
    }
}
