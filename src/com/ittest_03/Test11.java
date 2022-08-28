package com.ittest_03;

import java.util.Arrays;
import java.util.Random;

public class Test11 {
    public static void main(String[] args) {
        int [] arr = {10,522,545,666,888,996,1000};
        int [] newArr = new int[arr.length];
        Random  r = new Random();
        for (int i = 0; i < arr.length; ) {
            int prize = arr[r.nextInt(arr.length)];
            boolean flag = contains(newArr,prize);
            if (!flag){
                newArr[i]=prize;
                i++;
            }
        }
        for (int i : newArr) {
            System.out.println(i);

        }

    }
    public static boolean contains(int[]newArr,int prize){
        for (int j : newArr) {
            if (j == prize) {
                return true;
            }
        }
        return false;
    }

}
