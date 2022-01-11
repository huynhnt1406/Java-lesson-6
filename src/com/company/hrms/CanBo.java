package com.company.hrms;

public class CanBo {
    String DateOfBirth;
    String fullName;
    String Address;
    String Gender;

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public CanBo(String DateOfBirth ,String fullName, String Address , String Gender ) {
        this.DateOfBirth = DateOfBirth;
        this.fullName = fullName;
        this.Address = Address;
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "DateOfBirth='" + DateOfBirth + '\'' +
                ", fullName='" + fullName + '\'' +
                ", Address='" + Address + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
