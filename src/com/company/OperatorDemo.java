package com.company;

public class OperatorDemo {
    public static void main(String[] args){
        //定义两个变量
        int a = 10;
        int b = 20;

        //获取两个数据中较大的值
        int max = a < b ? a:b;
        System.out.println(max);
    }

}
