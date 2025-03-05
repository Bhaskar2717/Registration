package com.bhaskar.patientregistration.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhaskar.patientregistration.entities.Patient;
import com.bhaskar.patientregistration.repo.PatientRepo;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;


    @Override
    public Patient savePatient(Patient patient) {
        // TODO Auto-generated method stub
        return patientRepo.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        // TODO Auto-generated method stub
        return patientRepo.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepo.delete(patient);

    }

    @Override
    public Patient findById(int id) {
        return patientRepo.findById(id).get();
    }

    @Override
    public List<Patient> findAll() {
        // TODO Auto-generated method stub
        return patientRepo.findAll();
    }

}

