package com.ust.labourService.labourservice.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.labourService.labourservice.model.Labour;
import com.ust.labourService.labourservice.repository.LabourRepository;

@Service
@AllArgsConstructor
@Slf4j
public class LabourService {

	@Autowired
    private LabourRepository labourRepository;

   
    public Labour saveLabour(Labour labour) {
        return labourRepository.save(labour);
    }

  
    public Labour getLaborById(int labourId) {
        return labourRepository.findById(labourId).get();
    }
}