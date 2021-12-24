//У вас есть список имен: Alice, Bob, John.
//Вывести его в обратном порядке.

package com.blockwit.learn1.romannau;

public class Task4 {
    public static void main(String[] args){
        String[] Names = {"Alice", "Bob", "John"};
        for (int i = Names.length-1; i >=0; i--) {
            System.out.println(Names[i]);
        }
    }
}


