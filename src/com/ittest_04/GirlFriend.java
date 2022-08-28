package com.ittest_04;

public class GirlFriend {
    //属性


    private String name;
    private String gender;
    private int age;

    public void setAge(int age) {
        if (age >= 18 && age < 50) {
            this.age = age;
        } else {
            System.out.println("非法");
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setGender(String g) {
        gender = g;
    }
    public String getGender(){
        return gender;
    }

    //行为
    public void sleep() {
        System.out.println("睡觉");
    }

    public void eat() {
        System.out.println("吃饭");
    }
}
