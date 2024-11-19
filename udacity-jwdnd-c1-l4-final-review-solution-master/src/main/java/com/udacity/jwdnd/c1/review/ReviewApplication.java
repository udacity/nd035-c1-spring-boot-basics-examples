package com.udacity.jwdnd.c1.review;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udacity.jwdnd.c1.review.model.User;

@SpringBootApplication
@MappedTypes(User.class)
@MapperScan("com.udacity.jwdnd.c1.review.mapper")
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

}
