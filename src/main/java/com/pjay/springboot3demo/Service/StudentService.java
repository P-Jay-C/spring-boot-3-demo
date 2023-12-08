package com.pjay.springboot3demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjay.springboot3demo.Model.Student;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;

@Service
public class StudentService {
    
    static List<Student> studentList = new ArrayList<>();
    @Autowired
    private ObservationRegistry observationRegistry; 

    public Student addStudent(Student student) { 

        studentList.add(student);
        // return student;
       
        return Observation.createNotStarted("addStudent", observationRegistry)
                .observe(()->student);
    }

    public List<Student> getAllStudents() {
        // return studentList;

        return Observation.createNotStarted("getStudents", observationRegistry)
                .observe(()->studentList);
    }

    public Student getStudent(String id) {
        // return studentList
        // .stream()
        // .filter(studdent -> studdent.id().equals(id))
        // .findFirst()
        // .orElseThrow( ()->new RuntimeException("Student is not available") );

        
        return Observation.createNotStarted("getStudents", observationRegistry)
                .observe(()-> studentList
                            .stream()
                            .filter(studdent -> studdent.id().equals(id))
                            .findFirst()
                            .orElseThrow( ()->new RuntimeException("Student is not available"))
                            );

    }
}
