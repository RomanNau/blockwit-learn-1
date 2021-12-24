package com.blockwit.learn1.romannau;

import java.util.Random;
import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        int countOfSticks = 5;

        Scanner in = new  Scanner(System.in);
        Random random = new Random();

        boolean isComputer = false;
        for(;countOfSticks > 0;) {
            System.out.println("В игре " + countOfSticks + " палочек");
            int dropSticks;
            int maxSticks = 3;
            if(countOfSticks < 3) {
                maxSticks = countOfSticks;
            }
            if(isComputer) {
                System.out.println("Ход компьюера ");
                dropSticks = 1;
                System.out.println("Компьютер взял " + dropSticks + " палочек");
            } else {
                System.out.println("Ход пользователя ");
                System.out.println("Введите кол-во палочек от 1 до " + maxSticks);
                dropSticks = random.nextInt(maxSticks) + 1;
                System.out.println("Ползователь взял " + dropSticks + " палочек");
            }
            countOfSticks = countOfSticks - dropSticks;
            isComputer = !isComputer;
        }

        if(isComputer) {
            System.out.println("Компьютер выиграл");
        } else {
            System.out.println("Пользователь выиграл");
        }

        in.close();
    }

}
