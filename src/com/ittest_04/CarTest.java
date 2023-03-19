package com.ittest_04;

import java.util.Arrays;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入汽车品牌");
            String name = sc.next();
            c.setName(name);
            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            c.setCooler(color);

            arr[i] = c;

        }
        for (int i = 0; i < arr.length; i++) {
            Car car  = arr[i];
            System.out.println(car.getName()+car.getPrice()+car.getColor());
        }
    }
}
