//Тест на задачи T8S1...T8S4

package com.blockwit.learn1.romannau.Lession8;

import com.blockwit.learn1.romannau.Helper;

import java.util.Random;

public class TestS8T1 {
    public static void main(String[] args) {
        Random rand = new Random();
        MyIntArrayList testList = new MyIntArrayList();
        Helper testHelper = new Helper();

        for (int i = 0; i < 5; i++) {
            testList.add(i);                                  //формирую первоначальный список из 5-и элементов(значения от 0 до 4)
        }
        testHelper.printInList(testList.num);
        System.out.println();

        for (int k = 1; k < 30; k++) {
            int randomValue = rand.nextInt(25);    //добавляю 29 штук случайных чисел от 1 до 30, но но максимальное значение не больше 25
            System.out.println(randomValue);
            testList.add(randomValue);         // добавил рандомные числа в уже имеющийся список(из пяти элементов)
        }
        testHelper.printInList(testList.num); //распечатка полного списка, включая новые рандомные числа и старые

    }
}
