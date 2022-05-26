package com.ittest_01;

import java.util.Objects;

public class MethodDome4 {
    public static void main(String[] args) {
        System.out.println(compare(10, 10));
        System.out.println(compare("猫肚", "猫肚"));
        System.out.println(compare((byte) 10, (byte) 20));
        System.out.println(compare((float) 10, (float) 20));
        System.out.println(compare(10L,20L));
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static boolean compare(float a, float b) {
        return a == b;
    }

    public static boolean compare(String a, String b) {
        return Objects.equals(a, b);
    }
}
