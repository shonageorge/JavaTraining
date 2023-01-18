package com.ust.labourService.labourservice.controller;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ust.labourService.labourservice.model.Labour;
import com.ust.labourService.labourservice.service.LabourService;


@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class LabourController {

	@Autowired
    private LabourService labourService;

    @PostMapping("/labour/add")
    public ResponseEntity<Labour> saveLabour(@RequestBody Labour labour){
        Labour savedLabour = labourService.saveLabour(labour);
        return new ResponseEntity<>(savedLabour, HttpStatus.CREATED);
    }

    @GetMapping("/labour/{id}")
    public ResponseEntity<Labour> getLabourById(@PathVariable("id") int labourId){
    	Labour labour = labourService.getLaborById(labourId);
        return ResponseEntity.ok(labour);
    }
}

