package com.example.neo4jdemov2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.*;
import org.springframework.transaction.annotation.Transactional;


@RelationshipProperties @Transactional
public class IsLearningRelation {

    @RelationshipId
    private Long id;

    private Long marks;

    @TargetNode
    private Subject subject;

    public Long getMarks() {
        return marks;
    }

    public void setMarks(Long marks) {
        this.marks = marks;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
