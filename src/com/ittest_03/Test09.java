package com.ittest_03;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        int ticket = sc.nextInt();
        System.out.println("请输入仓位 0同等仓 1经济舱 ：");
        int seat = sc.nextInt();
        System.out.println("请输入购买月份：");
        int month = sc.nextInt();
        if (month >= 5 && month <= 10) {
            double[] discount = {0.9,0.8};
            ticket = ticketDiscount(ticket,seat,discount);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            double[] discount = {0.7,0.6};
            ticket = ticketDiscount(ticket,seat,discount);
        } else {
            System.out.println("请输入正确的月份");
        }
        System.out.println("打折后的票价是："+ticket);
    }
    public static int ticketDiscount(int ticket, int seat, double[] discount){
        if (seat == 0) {
            ticket = (int) (ticket * discount[0]);
        } else if (seat == 1) {
            ticket = (int) (ticket * discount[1]);
        } else {
            System.out.println("没有此仓位");
        }
        return ticket;
    }
}
