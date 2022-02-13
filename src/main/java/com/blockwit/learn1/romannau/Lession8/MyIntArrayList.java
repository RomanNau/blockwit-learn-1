//Написать класс MyIntArrayList. Этот класс будет представлять собой список.
// Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список

package com.blockwit.learn1.romannau.Lession8;

public class MyIntArrayList {
    int[] num;
    int countStatus;


    public MyIntArrayList() {      //MyIntArrayList-конструктор объекта класса MyIntArrayList с начальными параметрами.
        num = new int[0];
        countStatus = 0;          //countStatus-'счетчик' проверяет сколько действительно занятых значений, по индексу
    }

    public int add(int newValue) {
        if (countStatus == num.length) {
            int[] newNum = new int[num.length + 100];
            for (int i = 0; i < num.length; i++) {
                newNum[i] = num[i];
            }
            newNum[newNum.length - 1] = newValue;
            num = newNum;
        } else {
            num[countStatus] = newValue;
        }
        countStatus = countStatus + 1;
        return countStatus - 1;         //Возвращает индекс, по которому элемент добавлен.
    }

    public int get(int i) {
        return num[i];
    }

    public int size() {
        return countStatus;
    }

    public void clear() {
        countStatus = 0;
    }
}

