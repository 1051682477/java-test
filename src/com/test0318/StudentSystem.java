package com.test0318;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-------------------欢迎---------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("没有这样的选项");
                    break;
            }
        }

    }

    public static void addStudent(ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        stu.setId(id);
        if (contains(list, id)) {
            System.out.println("id已存在，请重新输入新id");
        } else {
            System.out.println("请输入学生姓名");
            stu.setName(sc.next());
            System.out.println("请输入学生年龄");
            stu.setAge(sc.nextInt());
            System.out.println("请输入学生家庭住址");
            stu.setAddress(sc.next());
            list.add(stu);
            System.out.println("学生信息添加成功");
        }
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学生id");
        String id = sc.next();
        if (contains(list, id)) {
            list.remove(getIndex(list, id));
            System.out.println(getIndex(list, id));
            System.out.println("删除id为" + id + "的学生成功");
        } else {
            System.out.println("所删除的id" + id + "不存在");
        }


    }

    public static void updateStudent(ArrayList<Student> list) {
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改的学生id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("修改id为" + id + "的学生不存在");
            return;
        }
        stu = list.get(index);
        System.out.println("请输入需要修改的学生姓名");
        String newName = sc.next();
        stu.setName(newName);
        System.out.println("请输入需要修改的学生年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);
        System.out.println("请输入需要修改的学生地址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);
        System.out.println("修改id为" + id + "的学生成功");
    }

    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}