package com.spring.rest_with_h2.service;

import java.util.List;

import com.spring.rest_with_h2.entity.Student;

public interface StudentService {
    
    public Student addStudent(Student std);

    public Student getStudent(int id);

    public List<Student> getAllStudents();

    public String deleteStudent(int id);

    public Student updateStudent(Student std,int id);
    
}
