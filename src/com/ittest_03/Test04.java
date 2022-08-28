package com.ittest_03;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {29, 30, 52, 55, 59, 62, 78, 96};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int number = sc.nextInt();
        int a = getIndex(arr, number);
        System.out.println(a);
    }

    public static int getIndex(int[] arr, int number) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
         return index;
    }
}