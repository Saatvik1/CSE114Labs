package com.company.Lab22P2;

public class Student extends Person {
private final String[] CLASS_STATUS = {"Freshman", "Sophomore", "Junior", "Senior" };

    public Student(String name, String address, String phoneNumber, String emailAddress, int classStatus) {
        super(name, address, phoneNumber, emailAddress);
        final String Class = CLASS_STATUS[classStatus];
    }


    @Override
    public String toString() {
        return "In class Student: " + this.getName();
    }



}
