package com.practice1;
import com.practice2.Student;
import org.w3c.dom.ls.LSOutput;

public class University {
    private Student student;
    private Student []students;


    public University (Student student, Student []students){
        this.student = student;
        this.students = students;
    }

    public void setStudent(Student student){
        this.student = student;
    }


    public Student getStudent (){
        return student;
    }


    public Student[] getStudents (){
        return students ;
    }


}
