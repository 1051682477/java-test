package com.company;

import java.util.*;

public class ForDome1 {
    public static void main(String[] args) {
        System.out.println("请输入大于100的三位数(如果您输入的是小数则只保留整数部分):");
        Scanner os = new Scanner(System.in);
        int max = (int)os.nextDouble();
        if (max > 100 && max <= 999) {
            for (int i = 100; i <= max; i++) {
                int three = i / 10 / 10 % 10;
                int two = i / 10 % 10;
                int one = i % 10;
                if (one * one * one + two * two * two + three * three * three == i) {
                    System.out.println("100至" + max + "期间的水仙花数为" + i);
                }
            }
        }
        else
            System.out.println("请输入符合要求的数字");
    }
}
