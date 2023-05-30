package com.example.neo4jdemov2.requests;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Property;

@Data
public class UpdateStudentRequest {
    private Long id;
    private String name;
    private String country;

    private Integer birthday;
}
