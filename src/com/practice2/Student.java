package com.practice2;

public class Student {
    private String name;
    private  int age;


    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name){
        this.name = name;

    }


    //public void print (){
    //    System.out.println(name);
    //}

    //public String toString(){
    //    return "Numele: " + name + "Age: " + age;
    //}


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
