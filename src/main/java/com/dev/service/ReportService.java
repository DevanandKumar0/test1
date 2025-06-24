package com.dev.service;

import java.util.List;


import com.dev.dto.SearchRequestDto;
import com.dev.entity.CitizenPlan;





public interface ReportService {
	
	public List<String> getPlanNames();
	public List<String> getPlanStatuses();
	public List<CitizenPlan> name(SearchRequestDto request); 
	public Boolean exportPdf();
	public Boolean exportExcel();
		
	
	
	
		
	
	
	

}
