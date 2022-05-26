package com.ittest_01;

import java.util.Arrays;

public class MethodDome5 {
    public static void main(String[] args) {
        int[] arr = {11, 332, 12, 2, 32, 67};
        printArr(arr);
        int[] arr1 = sort(arr);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arrMin(arr));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr.length - i - 1; a++) {
                int temp = arr[a];
                if (arr[a] > arr[a + 1]) {
                    arr[a] = arr[a + 1];
                    arr[a + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int arrMin(int[] arr){
        int min = arr[0];
        for (int x = 1;x<arr.length;x++){
            if (arr[x]<min){
                arr[x]=min;
            }
        }return min;
    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]);
            if (x < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
