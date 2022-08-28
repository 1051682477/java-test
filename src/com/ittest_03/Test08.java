package com.ittest_03;

import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = {15, 25, 62, 85, 95, 60};

        System.out.println(Arrays.toString(copyOfRange(arr, 2, 5)));
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] temp = new int[to - from];
        for (int i = from; i < to; i++) {
            System.out.println(i);
            for (int j = 0; j < temp.length; j++) {
                temp[j] = arr[i];
            }


        }
        return temp;
    }
}
