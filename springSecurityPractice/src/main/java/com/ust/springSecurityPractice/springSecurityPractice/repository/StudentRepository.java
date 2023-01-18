package com.ust.springSecurityPractice.springSecurityPractice.repository;

import com.ust.springSecurityPractice.springSecurityPractice.dto.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Integer> {
}
