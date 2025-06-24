package com.dev.dto;

import java.time.LocalDate;

import lombok.Data;
@Data
public class SearchRequestDto {
	
	private String planName;
	private String planStats;
	private String gender;
	private LocalDate staDate;
	private LocalDate enDate ;

}
