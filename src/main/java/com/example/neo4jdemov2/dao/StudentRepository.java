package com.example.neo4jdemov2.dao;


import com.example.neo4jdemov2.entity.Student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends Neo4jRepository<Student,Long> {
}
