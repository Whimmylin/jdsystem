package org.lanqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("org.lanqiao.mapper")
public class JdsystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(JdsystemApplication.class, args);
	}
}
