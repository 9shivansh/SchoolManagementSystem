package com.FoundationAcademy.SchoolManagementSystem.Receipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService {

    private final ReceiptRepository receiptRepository;

    @Autowired
    public ReceiptService(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }

    public Long receiptViewer(String number) {
        return receiptRepository.count();
    }
}
