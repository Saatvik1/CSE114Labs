package com.company.Lab22P2;

public class Staff extends Employee{
private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, String salary, int experience
    ,String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, experience);
        this.title = title;
    }


    @Override
    public String toString() {
        return "In class Staff: " + this.getName();
    }


}
