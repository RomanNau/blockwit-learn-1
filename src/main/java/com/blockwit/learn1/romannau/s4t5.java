//s4t5
//Написать программу, которая спрашивает у пользователя четыре числа.
// А затем меняет местами первое и последнее число и выводит все числа.

package com.blockwit.learn1.romannau;

import java.util.Scanner;

public class s4t5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] count = new int[4];
        for (int i = 0; i< 4; i++) {
            System.out.println("Введите число:  ");
            count[i] = in.nextInt();
        }
// меняем местами первое и последнее, сам не додумался подсмотрено на ютубе, хотя на самом деле просто

        int a = count[0];
        count[0] = count[3];
        count[3] = a;

        for (int i = 0; i< 4; i++) {
            System.out.println(count[i]);
        }
        in.close();
    }
}
