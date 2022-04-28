package com.company;

public class ConversionDemo {
    public static void main(String[] args) {
        //自动转换
        double d = 10.02;
        byte s = 10;
        int z = 10;
        int y = (int) 82.99;
        System.out.println((int)d == s && ++s == z);
        System.out.println();
    }

}
