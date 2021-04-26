package com.FoundationAcademy.SchoolManagementSystem.Fee;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Fee {

    @Id
    private int aNumber;
    private int admissionFee;
    private int tuitionFee;
    private int transportFee;
    private LocalDateTime dateOfSubmission;
    private boolean firstSlip;
    private boolean oneTime;
    private boolean jan;
    private boolean feb;
    private boolean mar;
    private boolean apr;
    private boolean may;
    private boolean jun;
    private boolean jul;
    private boolean aug;
    private boolean sep;
    private boolean oct;
    private boolean nov;
    private boolean dec;
    private int totalAmount;

    public Fee() {
    }

    public Fee(int aNumber, LocalDateTime date) {
        this.aNumber = aNumber;
        this.admissionFee = 3500;
        this.jan = false;
        this.feb = false;
        this.mar = false;
        this.apr = true;
        this.may = false;
        this.jun = false;
        this.jul = false;
        this.aug = false;
        this.sep = false;
        this.oct = false;
        this.nov = false;
        this.dec = false;
        this.dateOfSubmission = date;
        this.oneTime = false;
        this.firstSlip = true;
        this.totalAmount = 0;
        this.transportFee = 0;
        this.tuitionFee = 0;
    }

    public Fee(int aNumber, int admissionFee, boolean firstSlip, LocalDateTime dateOfSubmission, int tuitionFee, int transportFee, boolean oneTime, boolean jan, boolean feb, boolean mar, boolean apr, boolean may, boolean jun, boolean jul, boolean aug, boolean sep, boolean oct, boolean nov, boolean dec, int totalAmount) {
        this.aNumber = aNumber;
        this.admissionFee = admissionFee;
        this.tuitionFee = tuitionFee;
        this.transportFee = transportFee;
        this.oneTime = oneTime;
        this.jan = jan;
        this.feb = feb;
        this.mar = mar;
        this.apr = apr;
        this.may = may;
        this.jun = jun;
        this.jul = jul;
        this.aug = aug;
        this.sep = sep;
        this.oct = oct;
        this.nov = nov;
        this.dec = dec;
        this.firstSlip = firstSlip;
        this.dateOfSubmission = dateOfSubmission;
        this.totalAmount = totalAmount;
    }


    public int getaNumber() {
        return aNumber;
    }

    public void setaNumber(int aNumber) {
        this.aNumber = aNumber;
    }

    public int getAdmissionFee() {
        return admissionFee;
    }

    public void setAdmissionFee(int admissionFee) {
        this.admissionFee = admissionFee;
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

    public boolean isOneTime() {
        return oneTime;
    }

    public void setOneTime(boolean oneTime) {
        this.oneTime = oneTime;
    }

    public boolean isJan() {
        return jan;
    }

    public void setJan(boolean jan) {
        this.jan = jan;
    }

    public boolean isFeb() {
        return feb;
    }

    public void setFeb(boolean feb) {
        this.feb = feb;
    }

    public boolean isMar() {
        return mar;
    }

    public void setMar(boolean mar) {
        this.mar = mar;
    }

    public boolean isApr() {
        return apr;
    }

    public void setApr(boolean apr) {
        this.apr = apr;
    }

    public boolean isMay() {
        return may;
    }

    public void setMay(boolean may) {
        this.may = may;
    }

    public boolean isJun() {
        return jun;
    }

    public void setJun(boolean jun) {
        this.jun = jun;
    }

    public boolean isJul() {
        return jul;
    }

    public void setJul(boolean jul) {
        this.jul = jul;
    }

    public boolean isAug() {
        return aug;
    }

    public void setAug(boolean aug) {
        this.aug = aug;
    }

    public boolean isSep() {
        return sep;
    }

    public void setSep(boolean sep) {
        this.sep = sep;
    }

    public boolean isOct() {
        return oct;
    }

    public void setOct(boolean oct) {
        this.oct = oct;
    }

    public boolean isNov() {
        return nov;
    }

    public void setNov(boolean nov) {
        this.nov = nov;
    }

    public boolean isDec() {
        return dec;
    }

    public void setDec(boolean dec) {
        this.dec = dec;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getDateOfSubmission() {
        return dateOfSubmission;
    }

    public void setDateOfSubmission(LocalDateTime dateOfSubmission) {
        this.dateOfSubmission = dateOfSubmission;
    }

    public boolean isFirstSlip() {
        return firstSlip;
    }

    public void setFirstSlip(boolean firstSlip) {
        this.firstSlip = firstSlip;
    }
}


