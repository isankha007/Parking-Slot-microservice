package com.sankha.springboot.fileprocessing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sankha.springboot.fileprocessing.entity.Parkingslot;
import com.sankha.springboot.fileprocessing.repository.ParkingslotRepository;

@RestController
public class ParkingSlotController {
	@Autowired
	ParkingslotRepository repository;
	
	@GetMapping("/parking-slot/getSlot")
	public List<Parkingslot> getParkingSlot() {
		Parkingslot slot= new Parkingslot();
//		slot.setSlotName("Bike");
//		slot.setStatus(true);
		//return slot;
		Pageable firstPageWithTwoElements = PageRequest.of(0, 2,Sort.by("slotName"));
		return repository.findAll(firstPageWithTwoElements).toList();
	}

}
