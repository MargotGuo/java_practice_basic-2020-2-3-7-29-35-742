package com.thoughtworks;

public class ArrayPractice3 {

    /**
     * 完成本方法实现功能: 将一个整型数组array中值0的元素去掉，并把剩下的元素组成新的数组
     */
    public static int[] filterZero(int[] array) {
        int len = array.length;
        int[] temp = new int[len];
        int index = 0;
        for (int value : array) {
            if (value != 0) {
                temp[index] = value;
                index++;
            }
        }
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}
