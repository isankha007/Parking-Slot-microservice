package com.sankha.springboot.fileprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ParkingLotAssignmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingLotAssignmentServiceApplication.class, args);
	}

}
