package com.spring.rest_with_h2.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest_with_h2.entity.Student;
import com.spring.rest_with_h2.exceptions.StudentNotFoundException;
import com.spring.rest_with_h2.repository.StudentRepository;
import com.spring.rest_with_h2.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public Student addStudent(Student std) {
        Student s=repository.save(std);
        return s;
    }

    @Override
    public Student getStudent(int id) {
        return repository.findById(id).orElseThrow(()->new StudentNotFoundException("Student is not present with "+id+" ID."));
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> std=repository.findAll();
        if(std.size()==0){
            throw new StudentNotFoundException("No Student present for now. Add Students.");
        }else{
            return std;
        }
    }

    @Override
    public String deleteStudent(int id) {
        Student std=getStudent(id);
        String name=std.getStdName();
        repository.delete(std);
        return name+"'s Data has been deleted successfully..";
    }

    @Override
    public Student updateStudent(Student std, int id) {
        Student s=getStudent(id);
        s.setCourse(std.getCourse());
        s.setFees(std.getFees());
        s.setLastModified(new Date());
        s.setStdMail(std.getStdMail());
        s.setStdName(std.getStdName());
        Student s1=repository.save(s);
        return s1;
    }
    
}
