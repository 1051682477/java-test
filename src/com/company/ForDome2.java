package com.company;

public class ForDome2 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40, 50, 10, 60};
        for (int number : numbers) {
            if(number==50){
                break;
            }
            System.out.print(number + ",");
        }
        System.out.println();
        int[] nums = {10,11,12,13,14,15,16,17};
        for (int num : nums){
            if (num ==13 ){
                continue;
            }
            System.out.print(num+",");
        }
        System.out.println();
        String[] names = {"小明", "小刘", "金铭", "御清风"};
        for (String name : names) {
            if (name == "金铭"){
                break;
            }
            System.out.print(name + " ");
        }
    }
}


