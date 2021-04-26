package com.FoundationAcademy.SchoolManagementSystem.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

    Optional<Student> findByaNumber(int aNumber);
    List<Student> findBysClass(int sClass);
}
