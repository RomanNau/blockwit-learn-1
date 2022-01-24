//s4t6
//Написать программу, которая спрашивает у пользователя четыре числа.
// А затем меняет местами первое и последнее число только если последнее больше первого.
// Затем выводит числа.

package com.blockwit.learn1.romannau;

import java.util.Scanner;

public class S4t6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] count = new int[4];
        for (int i = 0; i< count.length; i++) {
            System.out.println("Введите число:  ");
            count[i] = in.nextInt();
        }

        if (count[3] > count[0]) {
        int a = count[0];
        count[0] = count[3];
        count[3] = a;

        for (int i = 0; i< 4; i++) {
            System.out.println(count[i]);
        }
        in.close();
    }
}
}
