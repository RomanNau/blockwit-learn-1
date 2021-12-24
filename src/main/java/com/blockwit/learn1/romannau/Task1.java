package com.blockwit.learn1.romannau;

public class Task1 {
    public static void main(String[] args) {
        int[] cash = {100, 109, 108, 114, 101, 100, 120, 200, 103, 112, 107, 150};
        int summa = 0;
        for (int i = 0; i < cash.length; i++) {
            summa = cash[i] + summa;
        }
        int avageYear = 0;
        avageYear = summa / 12;
        System.out.println("Средняя заработная плата: " + avageYear);

    }
}

//Задан массив заработных плат сотрудника за последние 12 месяцев:
//   100,109,108,114,101,100,120,200,103,112,107,150
//   Сотрудник уходит в отпуск на месяц. Необходимо рассчитать отпускные.
//   Отпускные - за месяц - это средняя заработная плата за последние 12 месяцев.
//   При решении использовать цикл.