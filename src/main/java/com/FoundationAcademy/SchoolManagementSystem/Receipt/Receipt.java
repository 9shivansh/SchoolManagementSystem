package com.FoundationAcademy.SchoolManagementSystem.Receipt;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Receipt {

    @Id
    private int rNumber;
    private int admissionNumber;
    private int tuitionFee;
    private int transportFee;
    private int totalAmount;
    private String sName;
    private String fName;
    private Date dob;


    public Receipt(int rNumber, int admissionNumber, int totalAmount, int tuitionFee, int transportFee, String sName, String fName, Date dob) {
        this.rNumber = rNumber;
        this.admissionNumber = admissionNumber;
        this.tuitionFee = tuitionFee;
        this.transportFee = transportFee;
        this.totalAmount = totalAmount;
        this.sName = sName;
        this.fName = fName;
        this.dob = dob;
    }

    public Receipt() {
    }

    public int getReceiptNumber() {
        return rNumber;
    }

    public void setReceiptNumber(int rNumber) {
        this.rNumber = rNumber;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public int getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(int transportFee) {
        this.transportFee = transportFee;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
