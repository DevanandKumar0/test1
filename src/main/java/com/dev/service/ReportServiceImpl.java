package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dto.SearchRequestDto;
import com.dev.entity.CitizenPlan;
import com.dev.repo.CitizenPlanRepository;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private CitizenPlanRepository repository;
	
	

	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub  = pending activity
		
		  List<String> planName = repository.getPlanName();
		  
		return planName;
	}

	@Override
	public List<String> getPlanStatuses() {
		// TODO Auto-generated method stub
		List<String> planStatus = repository.getPlanStatus();
		return planStatus;
	}

	@Override
	public List<CitizenPlan> name(SearchRequestDto request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean exportPdf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean exportExcel() {
		// TODO Auto-generated method stub
		return null;
	}

}
