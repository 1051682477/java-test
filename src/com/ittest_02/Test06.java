package com.ittest_02;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "评委打分：");
            arr[x] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(getCount(arr));
        /*输出除了最高分和最低分的平均值*/
        System.out.println(getAvg(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }
    public static  int getCount(int[] arr){
        int count = arr[0];
        for (int x =1; x<arr.length; x++){
            count += arr[x];
        }
        return count;
    }
    public static int getAvg(int[]arr){
        int max = getMax(arr);
        int min = getMin(arr);
        int count = getCount(arr);
        return (count-max-min)/(arr.length-2);
    }
}
