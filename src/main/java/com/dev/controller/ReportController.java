package com.dev.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.service.ReportService;

@RestController

public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@GetMapping("/")
	public ResponseEntity<Map<String, List<String>>> indexPage(){
		Map<String, List<String>> response = new HashMap<>();
		response.put("planName", service.getPlanNames());
		response.put("planStatuses", service.getPlanStatuses());
		
		return  ResponseEntity.ok(response);
		
		
	}
	

}
