package com.example;

public class TestStudent {

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "rahul";
        s.m1 = 50;
        s.m2 = 80;
        int avg = s.average(50, 70);
        System.out.println(avg);
    }

}
