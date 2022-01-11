package com.company.hrms;

public class Engineer extends CanBo {
    public Engineer(String DateOfBirth, String fullName, String Address, String Gender) {
        super(DateOfBirth, fullName, Address, Gender);
    }
    @Override
    public String toString() {
        return super.toString().concat(" is Engineer");
    }
}
