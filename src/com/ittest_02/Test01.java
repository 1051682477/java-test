package com.ittest_02;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String[] arr = new String []{"爬山","游泳","羽毛球","乒乓球","篮球","看电视","打游戏"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数：");
        int week = sc.nextInt();
        if (week<1 || week>7){
            System.out.println("你输入的星期数有误");
        }else {
            System.out.println("你今天的运动是："+arr[week-1]);
        }
    }
}


