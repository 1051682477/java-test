package com.company;
import java.util.*;
public class HeightDome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高");
        int height2 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高");
        int height3 = sc.nextInt();
        int a = (height1 > height2) ? height1 : height2;
        int b = (a > height3) ? a : height3;
        System.out.println("三个和尚中身高最高的是："+b+"cm");
    }
}
