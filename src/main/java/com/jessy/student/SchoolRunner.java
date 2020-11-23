package com.jessy.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        int kotlinPass ;
        Student stu = new Student("Jessy", 77, 66);
        stu.print();
        GraduateStudent gstu = new GraduateStudent("Jack", 60, 60, 60);
        gstu.print();
        System.out.println("High score:" + stu.highest());
    }

    private static void userInput() {
        System.out.print("Please enter students name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Please enter students english score:");
        int english = scanner.nextInt();
        System.out.print("Please enter students math score:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score:" + stu.highest());
    }
}
