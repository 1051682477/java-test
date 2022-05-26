package com.ittest_01;

public class MethodDome3 {
    public static void main(String[] args) {
        int max = getMax(10, 50);
        System.out.println(max);
        System.out.println(getMin(29,129));
        getStr("lalalal","maodu");
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int getMin(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static void getStr(String a,String b){
        System.out.println(a+b);
    }
}
