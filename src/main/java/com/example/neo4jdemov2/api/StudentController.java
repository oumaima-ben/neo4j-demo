package com.example.neo4jdemov2.api;

import com.example.neo4jdemov2.dao.StudentRepository;
import com.example.neo4jdemov2.entity.Student;
import com.example.neo4jdemov2.requests.StudentCreateRequest;
import com.example.neo4jdemov2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    
    @PostMapping()
    public Student createStudent(@RequestBody StudentCreateRequest student){
      return studentService.createStudent(student);
    }

    @GetMapping()
    public List<Student> getMessage(){
        return studentService.getAllStudents();
    }
}
