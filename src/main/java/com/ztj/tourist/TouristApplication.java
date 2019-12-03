package com.ztj.tourist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ={"com.ztj.tourist.dao.mapper"})
public class TouristApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristApplication.class, args);
	}

}
