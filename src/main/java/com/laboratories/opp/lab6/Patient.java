package com.laboratories.opp.lab6;
import java.util.Date;
import java.util.List;

public class Patient extends Person{
    String id;
    FullName name;
    Gender gender;
    Date birthDate;
    Integer age;
    Date accepted;
    History sickness;
    String [] prescriptions;
    String [] allergies;
    String [] specialReqs;
    List<OperationsStaff> operationsStaffs;

}
