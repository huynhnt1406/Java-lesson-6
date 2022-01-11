package com.company.hrms;

public class Employer extends CanBo {
    public Employer(String DateOfBirth, String fullName, String Address, String Gender) {
        super(DateOfBirth, fullName, Address, Gender);
    }

    @Override
    public String toString() {
        return super.toString().concat(" is Employer");
    }
}
