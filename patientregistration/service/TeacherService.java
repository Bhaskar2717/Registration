package com.bhaskar.patientregistration.service;

import java.util.List;

import com.bhaskar.patientregistration.entities.Teacher;

public interface TeacherService {

    public Teacher saveTeacher(Teacher teacher);

    public Teacher updateTeacher(Teacher teacher);

    public void deleteTeacher(Teacher teacher);

    public Teacher findById(int id);

    public List<Teacher> findAll();
}