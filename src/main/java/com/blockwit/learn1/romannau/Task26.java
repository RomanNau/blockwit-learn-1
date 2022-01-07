//Есть массив данных:
//9,8,7,6,5,4,3,2,1
//Вывести числа в обратном порядке


package com.blockwit.learn1.romannau;

public class Task26 {
    public static void main(String[] args) {
        int[] temp = {9,8,7,6,5,4,3,2,1};
        for(int i = temp.length - 1; i >= 0; i--) {
            System.out.println(temp[i]);
        }
    }
}
