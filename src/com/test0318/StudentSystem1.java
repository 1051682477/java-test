package com.test0318;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem1 {
    public static void main(String[] args) {
        loop:while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择：");
            String choose = sc.next();
            String result = null;
            for (StudentSys obj : studentSysList()){
                if (obj.getId().equals(choose) ){
                    result = obj.getOperate();
                    System.out.println(result);
                    if (choose.equals("5")){
                        break loop;
                    }
                }

            }
        }
    }


    public static ArrayList<StudentSys> studentSysList() {
        ArrayList<StudentSys> studentSysList = new ArrayList<>();
        StudentSys sys1 = new StudentSys("1", "添加学生");
        StudentSys sys2 = new StudentSys("2", "删除学生");
        StudentSys sys3 = new StudentSys("3", "修改学生");
        StudentSys sys4 = new StudentSys("4", "查询学生");
        StudentSys sys5 = new StudentSys("5", "退出");
        studentSysList.add(sys1);
        studentSysList.add(sys2);
        studentSysList.add(sys3);
        studentSysList.add(sys4);
        studentSysList.add(sys5);
        return studentSysList;
    }

    public static void addStudent(){
        System.out.println("添加学生");
    }
    public static void deleteStudent(){
        System.out.println("删除学生");
    }
    public static void updateStudent(){
        System.out.println("修改学生");
    }
    public static void queryStudent(){
        System.out.println("查询学生");
    }

}
