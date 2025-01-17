package com.laboratories.opp.lab1;

public class Data {
    public static void main(String[] args) {
        Student student1 = new Student("John", 18, 10);
        Student student2 = new Student("Ion", 20, 9);
        Student student3 = new Student ("Lyon", 19, 8);
        Student student4 = new Student("Henry", 20, 8);
        Student student5 = new Student("Victoria", 19, 9);
        Student student6 = new Student("Ana", 20, 8);
        Student student7 = new Student("Maria", 19, 9);


        University university1 = new University("ULIM", 1992, new Student[]{student1,student2});
        University university2 = new University("UTM", 1964, new Student[]{student3, student4,student5});
        University university3 = new University("ASEM",1965, new Student[]{student6, student7});
        university1.printInfo();
        university1.getStudentList();
        university2.printInfo();
        university2.getStudentList();
        university3.printInfo();
        university3.getStudentList();

        float average = (float)(student1.getMark() + student2.getMark() + student3.getMark() + student4.getMark() + student5.getMark() +
                student6.getMark()+ student7.getMark()) /(float)(university1.getStudentListLength()+university2.getStudentListLength()+ university3.getStudentListLength());
        System.out.println("-----------------------------------"+"\n"+
                           "The average is " + average);

    }
}
