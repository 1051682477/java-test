package com.company;
import java.util.*;
public class SwitchDemo {
    public static void main(String[] args){
        System.out.println("--------");
        Scanner os = new Scanner(System.in);
        System.out.println("请输入一个星期几的数字（1-7）：");
        int weekNum = (int)os.nextFloat();
        switch (weekNum){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的星期天有误");
                break;
        }
    }
}
