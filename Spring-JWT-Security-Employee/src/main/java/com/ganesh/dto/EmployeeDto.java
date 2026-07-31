package com.ganesh.dto;

import java.time.LocalDateTime;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmployeeDto {
	
	
	
	private Integer id;
	
	@NotNull(message = "Name Is Required")
	private String name;
	
	@NotNull(message = "Salary Is Required")
	private Double salary;
	
	@NotNull(message = "Department Is Required")
	private String department;
	
	@NotNull(message = "Address Is Required")
	private String address;
	
	@NotNull(message = "Mobile No Is Required")
	private String mobileNo;
	
	private LocalDateTime joiningdate;
	
	

}
