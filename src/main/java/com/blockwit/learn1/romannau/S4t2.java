//s4t2
//Написать программу, которая спрашивает у пользователя 5 имен.
// А затем выводит все эти имена.

package com.blockwit.learn1.romannau;

import java.util.Scanner;

public class S4t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите ваше имя:  ");
            names[i] = in.nextLine();
        }
        for(int i =0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        in.close();
    }
}
