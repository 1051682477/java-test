package com.ittest_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];


        //创建三个商品

        Goods g1 = new Goods("001", "桃子", -5.5, 1000);
        Goods g2 = new Goods("002", "蜂蜜", 15.7, 100);
        Goods g3 = new Goods("003", "拖鞋", 25, 80);

        //把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历商品
        double[] price = new double[3];
        double temp = 0;
        double avg  = 0 ;
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            double legalPrice = goods.getPrice() < 0 ? 0 : goods.getPrice();
            System.out.println(goods.getId() + "," + goods.getName() + "," +legalPrice + "," + goods.getCount());
            temp = temp + legalPrice;
            avg = temp/price.length;

        }
        System.out.println(temp);
        System.out.println(avg);
//           if(goods.getPrice()>0){
//               price[i] = goods.getPrice();
//           }else {
//               price[i] = 0;
//               System.out.printf("金额不合法，默认%s金额为0",goods.getName());
//               System.out.println();
//           }
    }

//        double avg ;
//        System.out.println(temp);
//        avg = temp/price.length;
//        System.out.println(avg);



}
