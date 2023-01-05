package com.company.Lab22P2;

public class Faculty extends Employee{
    private double officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, String salary, int experience,
                   double officeHours,String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, experience);
        this.officeHours = officeHours;
        this.rank = rank;
    }


    @Override
    public String toString() {
        return "In class Faculty: " + this.getName();
    }

}
