package com.laboratories.opp.lab1;
public class Student {
    String studentName;
    int studentAge;
    int studentMark;


    public  Student(String name, int age, int mark){
        this.studentName = name;
        this.studentAge = age;
        this.studentMark = mark;

    }
    @Override
    public String toString(){
        return "Name:" +  studentName + " "+ "Age:" + studentAge + " " + "Mark:" + studentMark;
    }

    public Integer getmark (){
        return this.studentMark;
    }
}

