package com.codegym.nghiadev;
public class Student {
    private int rollno;
    private String name;
    private static String college = "GTVT";
    public Student(){};
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "Back Khoa";
    }
    public void display(){
        System.out.println(rollno + "--" + name + "--" + college);
    }
}
