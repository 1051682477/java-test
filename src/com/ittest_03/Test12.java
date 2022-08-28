package com.ittest_03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        int[] createNumber = createNumber();
        System.out.println(Arrays.toString(createNumber));
        int[] userNumber = userNumber();
        System.out.println(Arrays.toString(userNumber));
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userNumber.length - 1; i++) {
            int redNumber = userNumber[i];
            for (int j = 0; j < createNumber.length - 1; j++) {
                if (redNumber == createNumber[j]) {
                    redCount++;
                    break;
                }
            }

        }
        int blueNumber = userNumber[userNumber.length - 1];
        if (blueNumber == createNumber[createNumber.length - 1]) {
            blueCount++;
        }
        if (redCount == 6 && blueCount == 1) {
            System.out.println("1000w");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("500w");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("3000");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("200");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("10");
        }else if ((redCount == 2 && blueCount == 1)||(redCount == 1 && blueCount == 1)||(redCount == 0 && blueCount == 1)) {
            System.out.println("5");
        }else {
            System.out.println("下次一定");
        }

    }

    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }

        }
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    public static int[] userNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("输入的红球号码已存在，请从新输入！");
                }
            } else {
                System.out.println("输入的红球号码超出范围，请重新输入！（范围1-33）");
            }

        }
        System.out.println("请输入蓝球号码");
        int blueNumber = sc.nextInt();
        while (true) {
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;

            } else {
                System.out.println("输入的蓝球球号码超出范围，请重新输入！（范围1-16）");
            }
        }
        return arr;
    }

    public static boolean contains(int[] arr, int prize) {
        for (int j : arr) {
            if (j == prize) {
                return true;
            }
        }
        return false;
    }
}
