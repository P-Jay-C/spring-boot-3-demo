package com.pjay.springboot3demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjay.springboot3demo.Model.Student;
import com.pjay.springboot3demo.Service.StudentService;

@RestController
@RequestMapping("/students")

public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student); 
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id){

        return studentService.getStudent(id);
    }



}
