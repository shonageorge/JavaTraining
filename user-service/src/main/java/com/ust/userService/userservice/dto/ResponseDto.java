package com.ust.userService.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
	
	private UserDto user;
	private LabourDto labour;
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public LabourDto getLabour() {
		return labour;
	}
	public void setLabour(LabourDto labour) {
		this.labour = labour;
	}
	
	
	
	

}
