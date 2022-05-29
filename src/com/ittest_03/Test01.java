package com.ittest_03;

public class Test01 {
    public static void main(String[] args) {
     Student s = new Student();
     Student s1 = new Student();
     Student s2  = s;
        System.out.println(s.name+s.age);
        s.age= 30;
        s.name="小包";
        System.out.println(s.name+s.age);
        s.study();
        s.doHomework();
        s1.age= 26;
        s1.name = "小新";
        System.out.println(s.name+s.age);
        System.out.println(s1.name);
        s.study();
        s1.doHomework();
        s2.doHomework();
    }
}
