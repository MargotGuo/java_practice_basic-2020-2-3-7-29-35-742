package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        int len = array.length;
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[len - i - 1] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
