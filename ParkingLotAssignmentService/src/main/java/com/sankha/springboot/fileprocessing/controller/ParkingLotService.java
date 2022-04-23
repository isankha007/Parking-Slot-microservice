package com.sankha.springboot.fileprocessing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sankha.springboot.fileprocessing.entiry.ParkingServiceEntity;

@RestController
public class ParkingLotService {
	
	@Autowired
	private ParkingServiceProxy proxy;
	
	@GetMapping("/parkinglot-service/bookParkinglot")
	public ParkingServiceEntity getparkingLotAllocated() {
		ResponseEntity<ParkingServiceEntity> resposnseEntity= new RestTemplate()
				.getForEntity("http://localhost:8090/parking-slot/getSlot", ParkingServiceEntity.class);
		ParkingServiceEntity parkingService=resposnseEntity.getBody();
		parkingService.setAcknowledgement("Slot Booked");
		return parkingService;
		
	}
	
	@GetMapping("/parkinglot-service-feign/bookParkinglot")
	public List<ParkingServiceEntity> getparkingLotFeignAllocated() {
	//	ParkingServiceEntity parkingService=proxy.getslot();
	//	parkingService.setAcknowledgement("Slot Booked");
		return proxy.getslot();
	}
	
	

}
