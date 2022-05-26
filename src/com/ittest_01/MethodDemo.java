package com.ittest_01;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber(12);
    }

    public static void isEvenNumber(int num) {
        if (num % 2 == 0) {
            System.out.println("ture");
        } else {
            System.out.println("false");
        }
    }
}


