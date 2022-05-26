package com.ittest_01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        int[] arr = new int[]{12,15,18,20,2,3,5,188,90,50};
        System.out.print("排序前：");
        System.out.println(Arrays.toString(arr));
        ArrayDemo.sort(arr);
        System.out.print("排序后：");
        System.out.println(Arrays.toString(arr));
    }
}

