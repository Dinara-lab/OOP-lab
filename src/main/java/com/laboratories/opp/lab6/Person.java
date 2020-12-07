package com.laboratories.opp.lab6;
import java.util.Date;
import java.util.List;

public class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    FullName name;
    Date birthDate;
    Gender gender;
    Address homeAddress;
    String phone;
    List<Hospital> hospitals;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.homeAddress = new Address("Igor Vieru");
        person1.gender = Gender.Male;
        System.out.println("Address:" + person1.homeAddress);
        System.out.println("Gender:" +  person1.gender);

        Person person2 = new Person();
        person2.homeAddress = new Address("Mircea cel Batran");
        person2.gender = Gender.Female;
        System.out.println("Address: " + person2.homeAddress);
        System.out.println("Gender: " + person2.gender);
    }
}