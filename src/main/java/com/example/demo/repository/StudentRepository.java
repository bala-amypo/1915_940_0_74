package com.example.demo.repository;

import org.springframework.data.Jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
