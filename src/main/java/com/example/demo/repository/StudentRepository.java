package com.example.demo.repository;

import org.springframework.data.Jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
