package com.ittest_01;

public class MethodDome2 {
    public static void main(String[] args) {
        double flag = isEvenNumber(11.55);
        System.out.println((float) flag);
    }

    public static float isEvenNumber(double number) {
        if (number % 2 == 0) {
            return 0;
        } else {
            return (float) (number % 2);
        }
    }
}

