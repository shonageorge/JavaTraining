package com.ust.labourService.labourservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.labourService.labourservice.model.Labour;

public interface LabourRepository  extends JpaRepository<Labour, Integer> {

}
