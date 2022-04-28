package com.company;
import java.util.*;
public class SwitchDemo1 {
    public static void main(String[] args) {
        System.out.println("--------");
        Scanner os = new Scanner(System.in);
        System.out.println("请输入一个月份的数字（1-12）：");
        int monthNum = (int) os.nextFloat();
        switch (monthNum){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("请输入正确的月份");
        }
    }
}
