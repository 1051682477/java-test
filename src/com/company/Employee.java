package com.company;

import java.io.*;

public class Employee {
    //这个实例化变量对子类可见
    public String name, age, sex;
    //私有变量，仅在当前类可见
    private double salary;
    private long bankNum;
    private String bankName;

    //在构造器中对name赋值
    public Employee(String empName, String empAge, String empSex) {
        name = empName;
        age = empAge;
        sex = empSex;
    }

    //设定工资salary值
    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void setBankName(String empBankName) {
        bankName = empBankName;
    }

    public void setBankNum(long empBankNum) {
        bankNum = empBankNum;
    }

    //打印信息
    public void printEmp() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + sex);
        System.out.println("薪水:" + salary);
        System.out.println("代发银行:" + bankName);
        System.out.println("个人银行卡号:" + bankNum);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("猫肚", "18", "女");
        empOne.setSalary(10000.01);
        empOne.setBankName("建设银行桐柏路支行");
        empOne.setBankNum(1102555000);
        empOne.printEmp();
    }
}

