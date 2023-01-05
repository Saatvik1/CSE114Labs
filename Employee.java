package com.company.Lab22P2;

public class Employee extends Person {
private String office, salary;
private int experience;

    public Employee(String name, String address, String phoneNumber, String emailAddress,String office,String salary
    ,int experience) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "In class Employee: " + this.getName();
    }
}
