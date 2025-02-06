package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Bean
	CommandLineRunner test(DataSource dataSource) {
		return args -> {
			try {
				dataSource.getConnection().close();
				log.info("DB 연결 성공!");
			} catch (SQLException e) {
				log.info("DB 연결 실패ㅠㅠ");
			}
		};
	}
}
