package com.example.task1.service.Impl;

import com.example.task1.model.student;
import com.example.task1.repository.StudentRepository;
import com.example.task1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<student> getAllStudents(){

        return studentRepository.findAll();
    }
    @Override
    public void saveStudent(student s){

        studentRepository.save(s);

    }
}
