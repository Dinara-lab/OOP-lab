package com.laboratories.opp.lab1;
import java.util.List;

public class University {
    String universityName;
    int foundationYear;
    List<Student> student;

    public University(String name, int year, List<Student> object) {
        this.universityName = name;
        this.foundationYear = year;
        this.student = object;
    }
    public void  printValue(){
        for (Student s : student){
            System.out.println(s);
        }
    }
    public void  showInfoUniversity() {

        System.out.print("University name:" + universityName + " ");
        System.out.println("Foundation Year:" + foundationYear+ " ");
        System.out.println("The list of students:");
        printValue();
    }
}

