package com.codegym.nghiadev;

public class TestStaticMethod {
    public static void main(String[] args) {
    Student.change();
    Student s1 = new Student(111,"Hoang");
    Student s2 = new Student(222, "Nam");
    s1.display();
    s2.display();
    }
}
