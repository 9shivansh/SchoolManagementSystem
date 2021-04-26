package com.FoundationAcademy.SchoolManagementSystem.Fee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/fee")
public class FeeController {

    private final FeeService feeService;

    @Autowired
    public FeeController(FeeService feeService) {
        this.feeService = feeService;
    }

    @GetMapping("{admissionNumber}")
    public Optional<Fee> showStudentFee(@PathVariable("admissionNumber") int admissionNumber) {
        return feeService.showStudentFee(admissionNumber);
    }

    @PutMapping("updateFee/{admissionNumber}")
    public Fee updateStudentFee(@PathVariable("admissionNumber") int admissionNumber, @RequestBody Fee fee) {
        return feeService.updateStudentFee(admissionNumber, fee);
    }

    @GetMapping("dues/{class}")
    public List<String> getDuesRemaining(@PathVariable("class") int sClass) {
        System.out.println(feeService.getRemainingDues(sClass));
        return feeService.getRemainingDues(sClass);
    }
}
