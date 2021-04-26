package com.FoundationAcademy.SchoolManagementSystem.Student;

import com.FoundationAcademy.SchoolManagementSystem.Fee.Fee;
import com.FoundationAcademy.SchoolManagementSystem.Fee.FeeRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final FeeRepository feeRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, FeeRepository feeRepository) {
        this.studentRepository = studentRepository;
        this.feeRepository = feeRepository;
    }

    public List<Student> showAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(@NotNull Student student) {
        Optional<Student> studentWithSameAdmissionNumber = studentRepository.findByaNumber(student.getAdmissionNumber());
        if(studentWithSameAdmissionNumber.isEmpty()) {
            Fee fee = new Fee(student.getAdmissionNumber(), LocalDateTime.now());
            int commission = student.getCommissionFee();
            fee.setTotalAmount(fee.getAdmissionFee() + 700 - commission);
            if(student.isVehicleRegistration()) {
                fee.setTotalAmount(fee.getTotalAmount() + 600);
                fee.setTransportFee(600);
            }
            fee.setTuitionFee(700);
            feeRepository.save(fee);
            studentRepository.save(student);
            return student;
        }
        throw new IllegalStateException("Admission Number already present in system");
    }
}