package com.sankha.springboot.fileprocessing.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.sankha.springboot.fileprocessing.entiry.ParkingServiceEntity;

@FeignClient(name ="parking-slot",url = "localhost:8090/")
public interface ParkingServiceProxy {
	@GetMapping("parking-slot/getSlot")
	public List<ParkingServiceEntity> getslot(); 
}
