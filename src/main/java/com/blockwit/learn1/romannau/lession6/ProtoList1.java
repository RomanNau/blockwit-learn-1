//Написать класс ProtoList1 в котором будет поле array типа массив целых чисел.
// Написать метод create который принимает размер и создает и присваивает полю array пустой массив целых чисел указанного размера.
// Написать метод getSize который возращает длину массива в поле array.
// Написать метод get, который принимает индекс( b ) и возращает элемент из массива array по указанному индексу.


package com.blockwit.learn1.romannau.lession6;

public class ProtoList1 {
    int[] array;

    public void create(int size) {
        int[] newArray = new int[size];
        this.array = newArray;
    }
    public int getSize(int[] array) {
        return array.length;
    }
    public  int get(int[] array, int b) {
        return array[b];
    }
}
