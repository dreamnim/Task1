package com.example.task1.controler;

import com.example.task1.model.student;
import com.example.task1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControler {

    private final StudentService studentservice;


    @Autowired
    public StudentControler(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping("/Hello")

    public String Hello(){
        return "Hello";
    }



    @RequestMapping(value = "/studentDetails",method = RequestMethod.GET)
    public ResponseEntity<List<student>> studentList(){
        return new ResponseEntity<>(studentservice.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping(value = "/saveDetails")
    public String saveStu(@RequestBody student std){
        studentservice.saveStudent(std);
        return "Saved Data .......";
    }

}
