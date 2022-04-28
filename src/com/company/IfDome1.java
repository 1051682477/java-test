package com.company;
import java.util.*;

public class IfDome1 {
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        System.out.println("请输入小明的分数：");
        //按顺序走时其实可以去掉一部份条件
        int score = os.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("请输入正确的分数");
        } else if (score >= 95 && score <= 100) {
            System.out.println("奖励笔记本电脑一台");
        } else if (score >= 90 && score <= 94) {
            System.out.println("手机一部");
        } else if (score >= 80 && score <= 89) {
            System.out.println("玩具一个");
        } else {
            System.out.println("再接再厉");
        }
    }
}
