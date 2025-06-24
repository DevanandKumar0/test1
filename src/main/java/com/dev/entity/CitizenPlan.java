package com.dev.entity;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "CITIZEN_PLANS_INFO")
public class CitizenPlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String 	citizenId;
	private String citizenName;
	private String gender;
	private String planName ;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEnDate;
	private Double benefitAmt;
	private String denialReason;
	private Double terminatedDate;
	private String terminationRsn;
	
	

}
