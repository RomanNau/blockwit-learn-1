package com.blockwit.learn1.romannau.lession6;
// тест класса ProtoList1

public class TestS7T4 {
    public static void main(String[] args) {

        ProtoList1 test = new ProtoList1();     // создается экземпляр класса ProtoList1 для работы с его методами

        test.create(3);                 //вызываю метод create: создается массив интовый с длиной три, но незаполненый, значения равны нулю
        int[] a = {34, 45, 6};

        System.out.print(test.getSize(a));             //вывести метод getSize, возращает длину массива в поле array
        System.out.print(", ");
        System.out.print(test.get(a, 0));           // вывести метод get, значение под указанным(0) индексом(34)

    }
}
