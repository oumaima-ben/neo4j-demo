package com.example.neo4jdemov2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.*;

import java.util.ArrayList;
import java.util.List;


@Node("Student")
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String country;


    @Relationship(type = "BELONGS_TO",direction = Relationship.Direction.OUTGOING)
    private Department department;

   /* @Relationship(type = "IS_LEARNING",direction = Relationship.Direction.OUTGOING)
    private List<IsLearningRelation> isLearningRelations=new ArrayList<>();*/
    @Relationship(type = "IS_LEARNING", direction = Relationship.Direction.OUTGOING)
    private List<IsLearningRelation> isLearningRelations;


    @Property(name = "birth_year")
    private Integer birthday;

    public Student(Long id, String name, String country, Department department, List<IsLearningRelation> isLearningRelations, Integer birthday) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.department = department;
        this.isLearningRelations = isLearningRelations;
        this.birthday = birthday;
    }

    public Student() {
        this.isLearningRelations = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<IsLearningRelation> getIsLearningRelations() {
        return isLearningRelations;
    }

    public void setIsLearningRelations(List<IsLearningRelation> isLearningRelations) {
        this.isLearningRelations = isLearningRelations;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }
}
