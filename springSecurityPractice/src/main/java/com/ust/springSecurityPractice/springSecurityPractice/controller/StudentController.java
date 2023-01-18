package com.ust.springSecurityPractice.springSecurityPractice.controller;

import com.ust.springSecurityPractice.springSecurityPractice.dto.StudentDetails;
import com.ust.springSecurityPractice.springSecurityPractice.model.StudentTeacherInfo;
import com.ust.springSecurityPractice.springSecurityPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studService;

    @PostMapping("/info")
    public StudentTeacherInfo addInfo(@RequestBody StudentTeacherInfo info){
        return studService.saveInfo(info);
    }

    @PostMapping("/studentDetails")
    public StudentDetails addStudentDetails(@RequestBody StudentDetails details) {
        return studService.saveStudentDetails(details);
        //return "Student Details Successfully added";
    }

    @GetMapping("/teacher")
    @PreAuthorize("hasAuthority('TEACHER')")
    public List<StudentDetails> getAllStudents(){
        return studService.getAll();
    }

    @GetMapping("/student/{id}")
    @PreAuthorize("hasAuthority('STUDENT')")
    public StudentDetails getStudent(@PathVariable int id){
        return studService.getStudentById(id);
    }

}
