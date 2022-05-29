package com.ittest_02;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<Object> lts =new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                lts.add(i);
            }
        }System.out.println(lts);
    }
}
