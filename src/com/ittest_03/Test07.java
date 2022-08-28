package com.ittest_03;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test07 {
    public static void main(String[] args) {
        compare(10,20);
        short b1 = 10;
        short b2 = 20;
        compare(b1,b2);

    }
    public static void compare(byte b1,byte b2) {
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(int i2,int i3) {
        System.out.println("int");
        System.out.println(i2 == i3);
    }
    public static void compare(long l1,long l2) {
        System.out.println("long");
        System.out.println(l1 == l2);
    }
    public static void compare(short s2,short s3) {
        System.out.println("short");
        System.out.println(s2 == s3);
    }

//        int [] arr = new int[] {11,515,45,454,4} ;
//        String [] name = new String[]{"zhangsan","lisi","wangwu"};
//        double [] high = new double[]{12.2,235.1,52.1,20};
//        System.out.println(Arrays.toString(arr));
//        arr [4] = 50;
//        System.out.println(Arrays.toString(arr));
//        for (int a = 0; a < arr.length; a++) {
//            System.out.println(arr[a]);
//
//        }
//        String [] arr = new String[50];
//        arr[0]= "zhangsan";
//        arr[3]= "lisi";
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]="李四"+i;
//            arr[i]="张三"+i;
//        }
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {1, 2, 3, 4, 5};

//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int randomIndex = r.nextInt(arr.length);
//            int temp = arr[i];
//            arr[i] = arr[randomIndex];
//            arr[randomIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr1 = arr;
//        arr1[0]=33;
//        arr[0] =3;
//        System.out.println(Arrays.toString(arr));
}

