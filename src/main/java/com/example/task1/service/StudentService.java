package com.example.task1.service;

import com.example.task1.model.student;

import java.util.List;

public interface StudentService {

    List<student> getAllStudents();
    void saveStudent(student s);
}
