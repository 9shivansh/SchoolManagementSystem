package com.FoundationAcademy.SchoolManagementSystem.Fee;

import com.FoundationAcademy.SchoolManagementSystem.Receipt.Receipt;
import com.FoundationAcademy.SchoolManagementSystem.Receipt.ReceiptRepository;
import com.FoundationAcademy.SchoolManagementSystem.Student.Student;
import com.FoundationAcademy.SchoolManagementSystem.Student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class FeeService {

    private final FeeRepository feeRepository;
    private final StudentRepository studentRepository;
    private final ReceiptRepository receiptRepository;

    @Autowired
    public FeeService(FeeRepository feeRepository, StudentRepository studentRepository, ReceiptRepository receiptRepository) {
        this.feeRepository = feeRepository;
        this.studentRepository = studentRepository;
        this.receiptRepository = receiptRepository;
    }

    public Optional<Fee> showStudentFee(int admissionNumber) {
        return feeRepository.findFeeByaNumber(admissionNumber);
    }

    public Fee updateStudentFee(int admissionNumber, Fee newFee) {
        Optional<Student> student = studentRepository.findByaNumber(admissionNumber);
        Optional<Fee> fee = feeRepository.findFeeByaNumber(admissionNumber);

        Student studentToBeUpdated = student.get();
        Fee oldFee = fee.get();
        boolean vehicle = false;
        int count = 0;
        int commission = studentToBeUpdated.getCommissionFee();
        int examinationFee = 0;

        if(studentToBeUpdated.isVehicleRegistration()) {
            vehicle = true;
        }

        if(!oldFee.isJan() && newFee.isJan()) {
            count++;
        }
        if(!oldFee.isFeb() && newFee.isFeb()) {
            count++;
        }
        if(!oldFee.isMar() && newFee.isMar()) {
            count++;
        }
        if(!oldFee.isMay() && newFee.isMay()) {
            count++;
        }
        if(!oldFee.isJun() && newFee.isJun()) {
            count++;
        }
        if(!oldFee.isJul() && newFee.isJul()) {
            count++;
        }
        if(!oldFee.isAug() && newFee.isAug()) {
            count++;
        }
        if(!oldFee.isSep() && newFee.isSep()) {
            count++;
            examinationFee = 400;
        }
        if(!oldFee.isOct() && newFee.isOct()) {
            count++;
        }
        if(!oldFee.isNov() && newFee.isNov()) {
            count++;
        }
        if(!oldFee.isDec() && newFee.isDec()) {
            count++;
        }

        if(vehicle) {
            newFee.setTransportFee(count * 600);
        }

        newFee.setTuitionFee((count * (700 - commission)) + examinationFee);
        Random rand = new Random();
        Receipt feeReceipt = new Receipt();
        feeReceipt.setTransportFee(newFee.getTransportFee());
        feeReceipt.setTuitionFee(newFee.getTuitionFee());
        feeReceipt.setReceiptNumber(rand.nextInt(1000));
        if(oldFee.isFirstSlip()) {
            newFee.setApr(true);
            if(vehicle) {
                feeReceipt.setTotalAmount(oldFee.getAdmissionFee() + 600 + 700 + newFee.getTuitionFee() + newFee.getTransportFee());
                feeReceipt.setTuitionFee(newFee.getTuitionFee() + 700);
                feeReceipt.setTransportFee(newFee.getTransportFee() + 600);
            }
            else {
                feeReceipt.setTotalAmount(oldFee.getAdmissionFee() + 700 + newFee.getTuitionFee() + newFee.getTransportFee());
                feeReceipt.setTuitionFee(newFee.getTuitionFee() + 700);
            }
            newFee.setTotalAmount(feeReceipt.getTotalAmount());
            newFee.setFirstSlip(false);
        }
        else {
            newFee.setFirstSlip(false);
            newFee.setTotalAmount(oldFee.getTotalAmount() + newFee.getTuitionFee() + newFee.getTransportFee());
            feeReceipt.setTotalAmount(newFee.getTuitionFee() + newFee.getTransportFee());
        }
        feeReceipt.setAdmissionNumber(newFee.getaNumber());
        feeReceipt.setDob(studentToBeUpdated.getDob());
        feeReceipt.setsName(studentToBeUpdated.getsName());
        feeReceipt.setfName(studentToBeUpdated.getFatherName());
        receiptRepository.save(feeReceipt);
        feeRepository.save(newFee);
        return newFee;
    }

    public List<String> getRemainingDues(int sClass) {
        List<String> remains = new ArrayList<>();
        List<Student> studentsForRequiredClass = studentRepository.findBysClass(sClass);

        for(Student student : studentsForRequiredClass) {
            int aNumber = student.getAdmissionNumber();
            Fee currentFee = feeRepository.findFeeByaNumber(aNumber).get();
            String remainingMonths = findMonthsRemaining(currentFee);
            if(remainingMonths.length() > 0) {
                String studentName = student.getsName();
                String result = studentName + " = " + remainingMonths;
                remains.add(result);
            }
        }

        return remains;
    }

    public String findMonthsRemaining(Fee currentFee) {

        String remainingMonths = "";

        if(!currentFee.isApr()) {
            remainingMonths = remainingMonths + " April ";
        }
        if(!currentFee.isMay()) {
            remainingMonths = remainingMonths + " May ";
        }
        if(!currentFee.isJun()) {
            remainingMonths = remainingMonths + " June ";
        }
        if(!currentFee.isJul()) {
            remainingMonths = remainingMonths + " July ";
        }
        if(!currentFee.isAug()) {
            remainingMonths = remainingMonths + " August ";
        }
        if(!currentFee.isSep()) {
            remainingMonths = remainingMonths + " September ";
        }
        if(!currentFee.isOct()) {
            remainingMonths = remainingMonths + " October ";
        }
        if(!currentFee.isNov()) {
            remainingMonths = remainingMonths + " November ";
        }
        if(!currentFee.isDec()) {
            remainingMonths = remainingMonths + " December ";
        }
        if(!currentFee.isJan()) {
            remainingMonths = remainingMonths + " January ";
        }
        if(!currentFee.isFeb()) {
            remainingMonths = remainingMonths + " February ";
        }
        if(!currentFee.isMar()) {
            remainingMonths = remainingMonths + " March ";
        }

        return remainingMonths.trim();
    }
}
