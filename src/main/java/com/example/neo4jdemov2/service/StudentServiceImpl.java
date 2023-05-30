package com.example.neo4jdemov2.service;

import com.example.neo4jdemov2.dao.DepartmentRepository;
import com.example.neo4jdemov2.dao.StudentRepository;
import com.example.neo4jdemov2.dao.SubjectRepository;
import com.example.neo4jdemov2.entity.Department;
import com.example.neo4jdemov2.entity.IsLearningRelation;
import com.example.neo4jdemov2.entity.Student;
import com.example.neo4jdemov2.entity.Subject;
import com.example.neo4jdemov2.requests.StudentCreateRequest;
import com.example.neo4jdemov2.requests.SubjectCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {


    private final StudentRepository studentRepository;

    private final DepartmentRepository departmentRepository;

    private final SubjectRepository subjectRepository;

    public Student createStudent1(Student student) {
        Department department = new Department();
        department.setDepName(student.getDepartment().getDepName());
        departmentRepository.save(department);

        student.getIsLearningRelations().forEach(isLearningRelation -> {
            Subject subject = new Subject();
            subject.setSubName(isLearningRelation.getSubject().getSubName());
            subjectRepository.save(subject);
        });

//        studentRepository.save(student);
        return studentRepository.save(student);
    }

    public Student createStudent(StudentCreateRequest createStudentRequest) {

        // Create the Student entity
        Student student = new Student();
        student.setName(createStudentRequest.getName());
        student.setCountry(createStudentRequest.getCountry());
        student.setBirthday(createStudentRequest.getBirthday());

// Create the Department entity and set it on the Student
        Department department = new Department();
        department.setDepName(createStudentRequest.getDepartment().getDepName());
        student.setDepartment(department);

// Save the Department entity
        departmentRepository.save(department);

// Create and associate the IsLearningRelation instances with the Student
        List<IsLearningRelation> isLearningRelationList = new ArrayList<>();

        if (createStudentRequest.getSubjects() != null) {
            for (SubjectCreateRequest createSub : createStudentRequest.getSubjects()) {
                Subject subject = new Subject();
                subject.setSubName(createSub.getSubName());
                subjectRepository.save(subject);

                // Create the IsLearningRelation and associate it with the Student and Subject
                IsLearningRelation relation = new IsLearningRelation();
                relation.setMarks(createSub.getMarks());
                relation.setSubject(subject);
                isLearningRelationList.add(relation);

                // Associate the IsLearningRelation with the Student
                student.setIsLearningRelations(isLearningRelationList);
            }
        }

        // Save the Student entity
        studentRepository.save(student);

        return student;


    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}


