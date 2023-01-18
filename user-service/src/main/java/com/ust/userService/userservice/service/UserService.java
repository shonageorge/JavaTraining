package com.ust.userService.userservice.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ust.userService.userservice.dto.LabourDto;
import com.ust.userService.userservice.dto.ResponseDto;
import com.ust.userService.userservice.dto.UserDto;
import com.ust.userService.userservice.model.User;
import com.ust.userService.userservice.repository.UserRepository;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

	@Autowired
    private UserRepository userRepository;
	@Autowired
    private RestTemplate restTemplate;

   
    public User saveUser(User user) {
        return userRepository.save(user);
    }

  
    public ResponseDto getUser(int userId) {

        ResponseDto responseDto = new ResponseDto();
        User user = userRepository.findById(userId).get();
        UserDto userDto = mapToUser(user);

        ResponseEntity<LabourDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8081/api/v1/labour/" + user.getLabourId(),
                LabourDto.class);

        LabourDto departmentDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setUser(userDto);
        responseDto.setLabour(departmentDto);

        return responseDto;
    }

    private UserDto mapToUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setUserAge(user.getUserAge());
        userDto.setUserAddress(user.getUserAddress());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
    
    

