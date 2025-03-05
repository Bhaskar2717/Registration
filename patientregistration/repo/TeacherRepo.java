package com.bhaskar.patientregistration.repo;

import com.bhaskar.patientregistration.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bhaskar.patientregistration.entities.Teacher;


public interface TeacherRepo  extends JpaRepository<Teacher, Integer> {

}