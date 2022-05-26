package com.ittest_01;

public class MethodDemo1 {
    public static void main(String[] args) {
        getMax(12, 50);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
