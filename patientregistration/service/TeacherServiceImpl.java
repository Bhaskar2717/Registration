package com.bhaskar.patientregistration.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhaskar.patientregistration.entities.Teacher;
import com.bhaskar.patientregistration.repo.TeacherRepo;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService
{

    @Autowired
    private TeacherRepo teacherRepo;


    @Override
    public Teacher saveTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        return teacherRepo.save(teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        // TODO Auto-generated method stub
        return teacherRepo.save(teacher);
    }

    @Override
    public void deleteTeacher(Teacher teacher) {
        teacherRepo.delete(teacher);

    }

    @Override
    public Teacher findById(int id) {
        return teacherRepo.findById(id).get();
    }

    @Override
    public List<Teacher> findAll() {
        // TODO Auto-generated method stub
        return teacherRepo.findAll();
    }

}


