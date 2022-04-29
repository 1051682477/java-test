package com.company;

public class Learn {
    int a = 15;
    public static void main(String[] args){
        System.out.println("公共类方法被调用");
        new Learn().test(500);
    }
    void test(int num){
        int b =30;
        System.out.println("私有方法被调用"+"公用变量"+num);
    }
}

