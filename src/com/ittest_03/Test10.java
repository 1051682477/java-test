package com.ittest_03;

import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原始密码:");
        int password = sc.nextInt();
        int[] arr = inputArr(password);
        System.out.println(Arrays.toString(arr));
//        int[] arr = {1, 9, 9, 6};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int number = 0;
        for (int j : arr) {
            number = number * 10 + j;
        }
        System.out.println(number);
    }

    public static int[] inputArr(int password) {
        int count = 0;
        int temp = password;
        while (password != 0) {
            password = password / 10;
            count++;
        }
        int[] arr = new int[count];
        int index = count - 1;
        while (temp != 0) {
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        return arr;
    }

}
