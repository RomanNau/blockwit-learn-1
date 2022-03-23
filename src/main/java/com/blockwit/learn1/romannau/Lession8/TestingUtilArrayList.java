//2. Записать 100000 элементов в массив java.util.ArrayList.
// Вывести на экран эти 100000 элементов. Замерить время на запись и чтение.(процессор: Ryzen 3700x)
// 9,10-ые вэбнары


package com.blockwit.learn1.romannau.Lession8;
import java.util.List;
import java.util.ArrayList;


public class TestingUtilArrayList {
    public static void main(String[] args){
        List test = new ArrayList();
        long startTimeRec = System.currentTimeMillis();
        for (int i =0; i<=100000; i++) {
            test.add(i);
        }
        long endTimeRec = System.currentTimeMillis();

        long startTimeRead = System.currentTimeMillis();
        for( int i = 0 ; i < test.size(); i++){
            System.out.println(test.get(i));

        }
        long endTimeRead = System.currentTimeMillis();
        System.out.println("Время записи:  "+(endTimeRec - startTimeRec)+" миллисекунд");
        System.out.println("Время чтения:  "+(endTimeRead - startTimeRead)+" миллисекунд");
    }
}



