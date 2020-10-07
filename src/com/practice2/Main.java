package com.practice2;

import com.practice1.University;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mihai0", 3);
        Student student2 = new Student("Mihai1", 4);
        Student student3 = new Student("Mihai2", 5);

        University university1 = new University(student1, new Student[]{student1, student2, student3});
        university1.setStudent(student2);
        student2.setName("Oleg");
        student2.setName("Oleg1");

        System.out.println(university1.getStudents()[1]);


    }
}
