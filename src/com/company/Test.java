package com.company;

public class Test {
    public void pupAge(){
        int age = 10;
        age += 1;
        System.out.println("这只小猫今年："+age+"岁了");
    }
    public void pupSex(){
        char sex = '男';
        String name = "猫肚";
        System.out.println("学生的名字是："+name+",他的性别是:"+sex);
    }
    public static void main(String[] args){
        Test test = new Test();
        Test test1 = new Test();
        test.pupAge();
        test.pupSex();
        test1.pupAge();
    }
}
