package com.FoundationAcademy.SchoolManagementSystem.Student;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {

    @Id
    @Column(unique = true)
    private int aNumber;
    private String sName;
    private String fName;
    private String mName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dob;
    private String address;
    private char gender;
    private int sClass;
    private int rollNo;
    private int commissionFee;
    private String mobileNo;
    private boolean vehicleRegistration;

    public Student() {
    }

    public Student(@JsonProperty("aNumber") int aNumber,
                   @JsonProperty("sName") String sName,
                   @JsonProperty("fName") String fName,
                   @JsonProperty("mName") String mName,
                   @JsonProperty("dob") Date dob,
                   @JsonProperty("address") String address,
                   @JsonProperty("gender") char gender,
                   @JsonProperty("sClass") int sClass,
                   @JsonProperty("rollNo") int rollNo,
                   @JsonProperty("commissionFee") int commissionFee,
                   @JsonProperty("mobileNo") String mobileNo,
                   @JsonProperty("vehicleRegistration") boolean vehicleRegistration) {
        this.aNumber = aNumber;
        this.sName = sName;
        this.fName = fName;
        this.mName = mName;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
        this.sClass = sClass;
        this.rollNo = rollNo;
        this.commissionFee = commissionFee;
        this.mobileNo = mobileNo;
        this.vehicleRegistration = vehicleRegistration;
    }

    public int getAdmissionNumber() {
        return aNumber;
    }

    public void setAdmissionNumber(int aNumber) {
        this.aNumber = aNumber;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getFatherName() {
        return fName;
    }

    public void setFatherName(String fName) {
        this.fName = fName;
    }

    public String getMotherName() {
        return mName;
    }

    public void setMotherName(String mName) {
        this.mName = mName;
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

    public int getsClass() {
        return sClass;
    }

    public void setsClass(int sClass) {
        this.sClass = sClass;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getCommissionFee() {
        return commissionFee;
    }

    public void setCommissionFee(int commissionFee) {
        this.commissionFee = commissionFee;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public boolean isVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(boolean vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }
}
