package com.ust.springSecurityPractice.springSecurityPractice.service;

import com.ust.springSecurityPractice.springSecurityPractice.dto.StudentDetails;
import com.ust.springSecurityPractice.springSecurityPractice.model.StudentTeacherInfo;
import com.ust.springSecurityPractice.springSecurityPractice.repository.InfoRepository;
import com.ust.springSecurityPractice.springSecurityPractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studRepo;

    @Autowired
    private InfoRepository infoRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public StudentTeacherInfo saveInfo(StudentTeacherInfo info) {
        info.setPassword(passwordEncoder.encode(info.getPassword()));
        return  infoRepo.save(info);
    }

    public StudentDetails saveStudentDetails(StudentDetails details) {
        return studRepo.save(details);
    }

    public List<StudentDetails> getAll() {
        return studRepo.findAll();
    }

    public StudentDetails getStudentById(int id) {
        return studRepo.findById(id).orElse(null);
    }
}
