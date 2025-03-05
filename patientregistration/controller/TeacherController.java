package com.bhaskar.patientregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhaskar.patientregistration.entities.Teacher;
import com.bhaskar.patientregistration.service.TeacherService;



@RestController
@RequestMapping("/Teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getTeacher(@PathVariable("id") int id)
    {
        Teacher teacher=teacherService.findById(id);
        return teacher;
    }

    @GetMapping("/")
    public List<Teacher> findAllPatients()
    {
        List<Teacher> teachers=teacherService.findAll();
        return teachers;
    }


    @PostMapping("/")
    public Teacher saveTeacherDetails(@RequestBody Teacher teacher)
    {
        Teacher savedTeacher=teacherService.saveTeacher(teacher);
        return savedTeacher;

    }

    @PutMapping("/")
    public Teacher updateTeacherDetails(@RequestBody Teacher teacher)
    {
        Teacher updatedTeacher=teacherService.updateTeacher(teacher);
        return updatedTeacher;

    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable("id") int id)
    {
        Teacher teacher=teacherService.findById(id);
        teacherService.deleteTeacher(teacher);
    }


}

