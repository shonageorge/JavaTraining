package com.ust.springSecurityPractice.springSecurityPractice.repository;

import com.ust.springSecurityPractice.springSecurityPractice.model.StudentTeacherInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InfoRepository extends JpaRepository<StudentTeacherInfo,Integer> {
    Optional<StudentTeacherInfo> findByName(String username);
}
