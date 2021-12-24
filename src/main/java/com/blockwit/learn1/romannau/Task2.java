//Рассчитать и вывести среднюю зп в день за каждый месяц.
// Считаем что в месяце 30 дней. Исходные данные - из первой задачи.
//Задан массив заработных плат сотрудника за последние 12 месяцев:
//   100,109,108,114,101,100,120,200,103,112,107,150


package com.blockwit.learn1.romannau;

public class Task2 {
    public static void main(String[] args) {
        int[] cashMonth = {100, 109, 108, 114, 101, 100, 120, 200, 103, 112, 107, 150};
        for (int i = 0; i < cashMonth[12]; i++) {
            int avageMonth +=cashMonth[i] / 30;
            System.out.println("Средняя заработная плата в день за месяц:   " + int avageMonth);
        }

    }
}