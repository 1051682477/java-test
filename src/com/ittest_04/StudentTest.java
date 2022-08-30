package com.ittest_04;

import java.util.Random;

public class StudentTest {
    public static void main(String[] args) {

        Student[] arr = new Student[3];
        Student name1 = new Student(1, "小明", 18);
        Student name2 = new Student(2, "王猫肚", 18);
        Student name3 = new Student(3, "李猫肚", 18);
        arr[0] = name1;
        arr[1] = name2;
        arr[2] = name3;
        Student name4 = new Student(4, "赵猫肚", 18);

        //判断唯一性
        boolean flag = contains(arr, name4.getId());
        if (flag) {
            System.out.println("重复id");
        //添加新增字段
        } else {
            //判断数组长度
            int count = countArr(arr);
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = name4;
                printArr(newArr);
            } else {
                arr[count] = name4;
                printArr(arr);
            }
        }
    }
    //遍历数组
    public static void printArr(Student[]arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu!=null){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge());
            }

        }
    }
    //数组满了之后赋值创建新数组下标加一
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //返回数据内元素个数
    public static int countArr(Student[] arr) {
        int count = 0;
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                count++;
            }
        }
        return count;
    }

    //判断新增字段是否与数组内字段想同
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student name = arr[i];
            if (name != null) {
                if (id == name.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Student[] studentArr (int index){

        Student[] arr = new Student[index];
        Random r = new Random();
        if(index>0){
            for (int i = 0; i < arr.length; i++) {
                int id = r.nextInt(1000)+1;
                char result = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
                String name = "猫肚"+result;
                int age = r.nextInt(25)+1;
                arr[i] = new Student(id,name,age);
            }
        }else {
            System.out.println("请输入大于0的字符长度");
        }
        return arr;
    }

}
