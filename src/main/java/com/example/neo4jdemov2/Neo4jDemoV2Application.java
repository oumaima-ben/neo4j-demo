package com.example.neo4jdemov2;

import com.example.neo4jdemov2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

/*@EnableNeo4jRepositories("com.example.neo4jdemov2.dao")
@ComponentScan({"com.example.neo4jdemov2.api","com.example.neo4jdemov2.service"})
@EntityScan("com.example.neo4jdemov2.entity")*/
@SpringBootApplication()
public class Neo4jDemoV2Application {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jDemoV2Application.class, args);
	}

}
