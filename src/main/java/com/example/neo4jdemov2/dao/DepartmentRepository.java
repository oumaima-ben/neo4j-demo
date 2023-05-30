package com.example.neo4jdemov2.dao;

import com.example.neo4jdemov2.entity.Department;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends Neo4jRepository<Department,Long> {
}
