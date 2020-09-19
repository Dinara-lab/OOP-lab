package com.laboratories.opp.lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Data {
    public static void main(String[] args) {

        List<Student> studentUniversityUTM = new ArrayList<>();
        studentUniversityUTM.add(new Student("Sarah", 19, 9));
        studentUniversityUTM.add(new Student("John", 20, 10));
        studentUniversityUTM.add(new Student("Veronica", 18, 10));

        List<Student> studentUniversityASEM = new ArrayList<>();
        studentUniversityASEM.add(new Student("Kaily", 20, 9));
        studentUniversityASEM.add(new Student("Johan", 20, 8));
        studentUniversityASEM.add(new Student("Valery", 20, 10));

        List<Student> studentUniversityULIM = new ArrayList<>();
        studentUniversityULIM.add(new Student("Selene", 19, 8));
        studentUniversityULIM.add(new Student("Jasmin", 18, 10));
        studentUniversityULIM.add(new Student("Irene", 20, 9));

        University university1 = new University("UTM", 1964, studentUniversityUTM);
        University university2 = new University("ASEM", 1991, studentUniversityASEM);
        University university3 = new University("ULIM", 1992, studentUniversityULIM);

        university1.showInfoUniversity();
        university2.showInfoUniversity();
        university3.showInfoUniversity();

        List<Integer> markList1 = studentUniversityUTM.stream().map(Student::getmark).collect(Collectors.toList());
        int listObjectSum1 = 0;
        for(int i=0; i < markList1.size(); i++)

            listObjectSum1 = markList1.get(0)+ markList1.get(1)+ markList1.get(2);

        List<Integer> markList2 = studentUniversityASEM.stream().map(Student::getmark).collect(Collectors.toList());
        int listObjectSum2 = 0;
        for(int i=0; i < markList2.size(); i++)

            listObjectSum2 = markList2.get(0)+ markList2.get(1)+ markList2.get(2);

        List<Integer> markList3 = studentUniversityULIM.stream().map(Student::getmark).collect(Collectors.toList());
        int listObjectSum3 = 0;
        for(int i=0; i < markList3.size(); i++)

            listObjectSum3 = markList3.get(0)+ markList3.get(1)+ markList3.get(2);

        double totalStudentNum =+ (double)studentUniversityUTM.size()+ (double)studentUniversityASEM.size()+ (double)studentUniversityULIM.size();
        double average = (listObjectSum1 + listObjectSum2 + listObjectSum3) /totalStudentNum;
        System.out.println("The average is of marks is: " + average);

    }
}
