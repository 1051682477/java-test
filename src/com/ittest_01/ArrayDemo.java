package com.ittest_01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public static void sort (int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int a=0;a<arr.length-i-1;a++){
                if (arr[a]>arr[a+1]){
                    int temp = arr[a];
                    arr[a] = arr[a+1];
                    arr[a+1]=temp;
                }
            }
        }
    }

//        arr[0] = 100;
//        arr[1] = 50;
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for (int a:arr)
//            System.out.println(a);

//        System.out.println(arr[0]);
//        int [] arr2 = arr;
//        arr2[1] =150;
//        System.out.println(arr2);
//        System.out.println(arr2.length);
}
