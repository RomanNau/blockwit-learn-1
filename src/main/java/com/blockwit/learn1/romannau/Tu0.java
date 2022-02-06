//tu0
//Задан массив чисел 12,7,89,-4,8,9. Необходимо:
//1. Распечатать его.
//2. Отсортировать его в порядке возрастания.
//3. Распечатать еще раз.

package com.blockwit.learn1.romannau;

public class Tu0 {
    public static void main(String[] args) {
        int[] count = {12, 7, 89, -4, 8, 9};
        for (int num : count) {
            System.out.print(num + "," + " ");
        }
        System.out.print("\n");
        int a;
        do {
            a = 0;
            for (int i = 0; i < count.length - 1; i++) {
                if (count[i] > count[i + 1]) {
                    int temp = count[i];
                    count[i] = count[i + 1];
                    count[i + 1] = temp;
                    a++;
                }
            }
        } while (a > 0);
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
