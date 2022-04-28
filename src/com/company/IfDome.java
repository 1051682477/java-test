package com.company;

import java.util.*;

public class IfDome {
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = os.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else
            System.out.println(num + "是奇数");
    }
}
