package com.example.neo4jdemov2.requests;

import lombok.Data;

@Data
public class SubjectCreateRequest {

    private String subName;
    private Long marks;

}
