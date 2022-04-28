package com.company;

import java.io.*;

public class EmployeeStatic {
    //salary是静态的私有量
    private static double salary;
    private static String name;
    //DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";

    public static void main(String[] args) {
        salary = 1000.002;
        name = "猫肚";
        System.out.println(DEPARTMENT + name + "部门工资：" + salary + "元");
    }
}
