//s4t1
//Написать программу, которая спрашивает у пользователя его год рождения и имя.
// Затем вычисляет сколько ему лет и выводит в формате: "<имя>, вам <кол-во_лет> лет"

package com.blockwit.learn1.romannau;

import java.util.Scanner;

public class S4t1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] yearOfBirth = new int[3];
        String[] names = new String[3];
        for (int i = 0; i < yearOfBirth.length; i++) {
            System.out.println("Введите ваш год рождения:  ");
            yearOfBirth[i] = in.nextInt();
            in.nextLine();

            System.out.println("Введите ваше имя:  ");
            names[i] = in.nextLine();
        }
        for(int i=0; i < names.length; i++) {
            System.out.println(names[i] + "," + " Вам  " + (2022 - yearOfBirth[i]) + " лет ");
        }
        in.close();
    }
}
