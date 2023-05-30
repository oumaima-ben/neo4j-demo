package com.example.neo4jdemov2.service;

import com.example.neo4jdemov2.entity.Student;
import com.example.neo4jdemov2.requests.StudentCreateRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    public Student createStudent1(Student student);
    Student createStudent(StudentCreateRequest student);

    List<Student> getAllStudents();
}
