package com.FoundationAcademy.SchoolManagementSystem.Fee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeeRepository extends JpaRepository<Fee, Integer> {
    Optional<Fee> findFeeByaNumber(int admissionNumber);
}
