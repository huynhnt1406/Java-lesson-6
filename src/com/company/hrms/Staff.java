package com.company.hrms;

public class Staff extends CanBo{

    public Staff(String DateOfBirth, String fullName, String Address, String Gender) {
        super(DateOfBirth, fullName, Address, Gender);
    }

    @Override
    public String toString() {
        return super.toString().concat(" is Staff");
    }
}
