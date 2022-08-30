package com.ittest_04;

import java.util.Random;

public class StudentDelTest {
    public static void main(String[] args) {

        Student[] arr = new Student[3];
        Student name1 = new Student(1, "小明", 18);
        Student name2 = new Student(2, "王猫肚", 18);
        Student name3 = new Student(3, "李猫肚", 18);
        arr[0] = name1;
        arr[1] = name2;
        arr[2] = name3;
        int index = getIndex(arr,4);
        if(index>0){
            arr[index]=null;
            StudentTest.printArr(arr);
        }else {
            System.out.println("id不存在");
        }
        Student[] stuArr = StudentTest.studentArr(5);
        StudentTest.printArr(stuArr);
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu!=null){
                int sid = stu.getId();
                if(sid ==id){
                    return i;
                }
            }
        }
        return -1;
    }
}

