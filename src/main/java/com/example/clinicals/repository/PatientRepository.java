package com.example.clinicals.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinicals.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

}
