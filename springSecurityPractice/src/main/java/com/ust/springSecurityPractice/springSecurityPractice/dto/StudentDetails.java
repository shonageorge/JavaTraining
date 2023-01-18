package com.ust.springSecurityPractice.springSecurityPractice.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StudentDetails {
    @Id
    @GeneratedValue
    private int studentId;
    private String studentName;
    private String studentAddress;
    private double studentMarks;

    public StudentDetails() {
    }

    public StudentDetails(int studentId, String studentName, String studentAddress, double studentMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentMarks = studentMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public double getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(double studentMarks) {
        this.studentMarks = studentMarks;
    }
}
