package com.example.clinicals.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinicals.entity.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

	List<ClinicalData> findByPatientIdAndComponentNameOrderByMeasuredDateTime(int patientId, String componentName);

}
