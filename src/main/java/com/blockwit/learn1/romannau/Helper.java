//Сделать класс Helper. Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
// Переписать предыдущую задачу Tu0, так чтобы она использовала метод printIntArray.
//


package com.blockwit.learn1.romannau;

public class Helper {

        public void printArray(int[] mass) {
            for(int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + ",");
            }

    }
}
