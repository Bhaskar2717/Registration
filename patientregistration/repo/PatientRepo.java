package com.bhaskar.patientregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhaskar.patientregistration.entities.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
