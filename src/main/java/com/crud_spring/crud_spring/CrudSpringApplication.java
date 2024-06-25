package com.crud_spring.crud_spring;

import model.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import repository.CourseRepository;

import java.beans.JavaBean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@ConditionalOnBean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course course = new Course();
			course.setName("Angular + Spring");
			course.setCategory("Front-end");

			courseRepository.save(course);
		};
	}
}
