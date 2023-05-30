package com.example.neo4jdemov2.requests;


import com.example.neo4jdemov2.entity.Department;
import com.example.neo4jdemov2.entity.Subject;
import lombok.Data;

import java.util.List;

@Data
public class StudentCreateRequest {

    private String name;
    private String country;
    private Integer birthday;
    private List<SubjectCreateRequest> subjects;

    private DepartmentCreateRequest department;




}
