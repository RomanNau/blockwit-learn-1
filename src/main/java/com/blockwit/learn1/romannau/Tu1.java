//Сделать класс Helper. Внутри него метод printIntArray, который принимает массив чисел и распечатывает их.
// Переписать предыдущую задачу Tu0, так чтобы она использовала метод printIntArray.
//Задан массив чисел 12,7,89,-4,8,9.
//1. Распечатать его.
//2. Отсортировать его в порядке возрастания.
//3. Распечатать еще раз.


package com.blockwit.learn1.romannau;

public class Tu1 {
    public static void main(String[] args) {
        Helper obiect = new Helper();
        int mass[] = {12, 7, 89, -4, 8, 9};

            obiect.printArray(mass);
            System.out.print("\n");

        for(int i = 0; i < mass.length; i++) {
            int num = mass[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftNum = mass[j];
                if ( num < leftNum) {
                    mass[j+1] = leftNum;
                    mass[j] = num;
                } else {
                    break;
                }
            }
        }

            obiect.printArray(mass);

    }
}
