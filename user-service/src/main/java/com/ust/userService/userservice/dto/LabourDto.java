package com.ust.userService.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class LabourDto {
	
	 	private Long labourId;
	    private String labourName;
	    private String labourAddress;
	    private String labourCode;

}
