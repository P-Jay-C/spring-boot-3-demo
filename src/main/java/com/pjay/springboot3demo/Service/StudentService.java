package com.pjay.springboot3demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pjay.springboot3demo.Model.Student;

@Service
public class StudentService {
    
    static List<Student> studentList = new ArrayList<>();

    public Student addStudent(Student student) { 

        studentList.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public Student getStudent(String id) {
        return null;
    }
}
