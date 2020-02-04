package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int len = array.length;
        int[] newArray = new int[len + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = number;
        for (int j = newArray.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (newArray[i] > newArray[i + 1]) {
                    int temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                }
            }
        }
        return newArray;
    }
}
