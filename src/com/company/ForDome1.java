package com.company;

import java.util.*;

public class ForDome1 {
    public static void main(String[] args) {
        System.out.println("请输入大于100的三位数:");
        Scanner os = new Scanner(System.in);
        int max = os.nextInt();
        for (int i = 100; i <= max; i++) {
            int three = i / 10 / 10 % 10;
            int two = i / 10 % 10;
            int one = i % 10;
            if (one * one * one + two * two * two + three * three * three == i) {
                System.out.println("100至"+max+"期间的水仙花数为"+i);
            }
        }
    }
}
