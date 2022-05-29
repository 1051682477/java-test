package com.ittest_02;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {19, 20, 22, 35, 65, 41};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
}
