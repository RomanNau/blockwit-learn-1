// 9, 10 вэбинар интерфэйсы, ревализация методов класса MyArrayList, который наследует интерфэйс IMyIntArrayList


package com.blockwit.learn1.romannau.Lession8;

public class MyArrayList implements IMyIntArrayList {
    int[] num;
    int countStatus;

    public MyArrayList() {
        num = new int[0];
        countStatus = 0;
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
        return countStatus - 1;
    }
    public int get(int i) {
        return num[i];
    }

    public int size() {
        return countStatus;
    }

}
