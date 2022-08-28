package com.ittest_03;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {11,55,66,55,77,99,512};
        int[] arr2 = {11,55,66,55,77,9,512};
        boolean a ;
        a = compare(arr,arr2);
        System.out.println(a);
    }

    public static boolean compare(int[] arr, int[] arr2) {
        if (arr.length != arr2.length) {
            return false;
        }
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != arr2[x]) {

                System.out.println(arr2[x]);
                return false;
            }
        }
        return true;
    }
}
