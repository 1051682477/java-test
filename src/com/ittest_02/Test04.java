package com.ittest_02;

public class Test04 {
    public static void main(String[] args) {
        int[]arr = {11,22,33,44,55};
        int[]arr1 = {11,22,33,44,55};
        System.out.println(compare(arr,arr1));
    }

    public static boolean compare(int[]arr,int[]arr1) {
        if (arr.length!=arr1.length){
            return false;
        }
        for (int x =0;x<arr.length;x++){
            if (arr[x]!=arr1[x]){
                return false;
            }
        }
        return true;
    }
}
