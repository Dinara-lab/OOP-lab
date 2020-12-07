package com.laboratories.opp.lab1;

public class University {
    private String universityName;
    private int foundationYear;
    private Student[] studentList;

    public University(String name, int year, Student[] studentList) {
        this.universityName = name;
        this.foundationYear = year;
        this.studentList = studentList;
    }

    public void getStudentList() {
        for (int i = 0; i < studentList.length; i++)
            System.out.println(studentList[i]);
    }
    public int getStudentListLength(){
        return  studentList.length;
    }


    public void printInfo(){
        System.out.println("-----------------------------------"+ "\n" +
                           "University name: " + universityName + "\n" +
                           "Foundation Year: " + foundationYear + "\n" +
                           "List of students: ");
    }
}


