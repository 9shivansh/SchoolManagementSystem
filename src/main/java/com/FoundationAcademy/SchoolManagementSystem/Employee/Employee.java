package com.FoundationAcademy.SchoolManagementSystem.Employee;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @Column(unique = true)
    private int eNumber;
    private String eName;
    private String eDesignation;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;
    private String address;
    private char gender;
    private int salary;
    private String mobileNo;

    public Employee() {
    }

    public Employee(int eNumber, String eName, String eDesignation, Date dob, String address, char gender, int salary, String mobileNo) {
        this.eNumber = eNumber;
        this.eName = eName;
        this.eDesignation = eDesignation;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.salary = salary;
        this.mobileNo = mobileNo;
    }

    public int geteNumber() {
        return eNumber;
    }

    public void seteNumber(int eNumber) {
        this.eNumber = eNumber;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteDesignation() {
        return eDesignation;
    }

    public void seteDesignation(String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
