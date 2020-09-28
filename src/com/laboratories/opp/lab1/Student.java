package com.laboratories.opp.lab1;
public class Student {
    private String studentName;
    private int studentAge;
    private int studentMark;


    public  Student(String name, int age, int mark){
        this.studentName = name;
        this.studentAge = age;
        this.studentMark = mark;
    }

    public int getMark(){
        return studentMark;
    }

    @Override
    public String toString(){
        return "Name:" +  studentName + " "+ "Age:" + studentAge + " " + "Mark:" + studentMark;
   }

}

