package com.blockwit.learn1.romannau.Lession8;
//Записать 100000 элементов в массив java.util.LinkedList.
//Вывести на экран эти 100000 элементов. Замерить время на запись и чтение.

import java.util.LinkedList;
import java.util.List;


public class TestLinkedList {
    public static void main(String[] args){
    List obiect = new LinkedList();
        long startTimeRec = System.currentTimeMillis();
        for (int i =0; i<=100000; i++) {
            obiect.add(i);
        }
        long endTimeRec = System.currentTimeMillis();

        long startTimeRead = System.currentTimeMillis();
        for( int i = 0 ; i < obiect.size(); i++){
            System.out.println(obiect.get(i));

        }
        long endTimeRead = System.currentTimeMillis();
        System.out.println("Время записи:  "+(endTimeRec - startTimeRec)+" миллисекунд");
        System.out.println("Время чтения:  "+(endTimeRead - startTimeRead)+" миллисекунд");
    }
}
