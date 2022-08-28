package com.ittest_03;

public class Test02 {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println(x + "," + y + "," + z);
                }
            }
        }
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        mains(arr);
    }

    public static void mains(int[] arr) {

        int sum = 0;
        for (int x = 0;x<arr.length;x++){
            if (arr[x]%10!=7 && arr[x]/10%10!=7 && arr[x]%2==0){
                sum += arr[x];
            }
        }
        System.out.print(sum);
    }
}
