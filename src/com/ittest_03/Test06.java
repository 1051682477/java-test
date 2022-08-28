package com.ittest_03;

import java.util.Scanner;

import static com.ittest_03.Test05.printArray;

public class Test06 {
    public static void main(String[] args) {
//        int[] arr = new int[6];
//        Scanner sc = new Scanner(System.in);
//        for (int x = 0; x < arr.length; x++) {
//            System.out.println("请输入分值");
//            arr[x] = sc.nextInt();
//        }
//        int max = getMax(arr);
//        int min = getMin(arr);
//        int sum = getSum(arr);
//        int avg = getAvg(arr);
//        System.out.println("最高分：" + max + "最低分：" + min + "总分:" + sum + "平均分：" + avg);
        skip(10);
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

    public static int getSum(int[] arr) {
        int sum = arr[0];
        for (int x = 1; x < arr.length; x++) {
            sum = arr[x] + sum;
        }
        return sum;
    }

    public static int getAvg(int[] arr) {
        return (getSum(arr) - getMin(arr) - getMax(arr)) / (arr.length - 2);

    }
    public static void skip(int a){

        for (int i = 1; i < a; i++) {
            if(i==3){
                break;
            }
            System.out.println("包子"+i);
            for (int x = 1; x < a; x++) {
                if(x==3){
                    continue;
                }
                System.out.println("包子"+x);

            }

        }

    }

}
