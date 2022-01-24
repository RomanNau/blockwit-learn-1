//s4t4
//Написать программу, которая спрашивает, сколько у Вас друзей.
//А потом спрашивает имена этих друзей. Затем выводит имена друзей в обратном порядке.


package com.blockwit.learn1.romannau;

import java.util.Scanner;

public class S4t4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countfreds;
        System.out.println("Ввести точное кол-во ваших друзей :  ");
        int countfrends = in.nextInt();
        in.nextLine();


        if(countfrends>0){
            String[] names = new String[countfrends];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя друга:  ");
            names[i] = in.nextLine();

        }
        for (int k = names.length-1; k >= 0; k--) {
            System.out.println(names[k]);
            }
        } else {
            System.out.println("У вас нет друзей, Вы С о Ц и О п а Т!!! Опасны для общества!! ");
        }

        in.close();
    }
}



