package com.spring.rest_with_h2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest_with_h2.entity.Student;
import com.spring.rest_with_h2.service.StudentService;

@RestController
public class HomeController {

    @Autowired
    private StudentService service;

    @GetMapping(path={"/","/home"} )
    public String home(){
        return "<br><div style='text-align:center; color:red; font-size:20px; font-family:cursive'> !!..Home Page..!! </div>";
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<List<Student>>(service.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") int id){
        return new ResponseEntity<Student>(service.getStudent(id), HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<Student> addStudent(@RequestBody Student std){
        return new ResponseEntity<Student>(service.addStudent(std),HttpStatus.CREATED);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int id){
        return new ResponseEntity<String>(service.deleteStudent(id), HttpStatus.OK);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id,@RequestBody Student std){
        return new ResponseEntity<Student>(service.updateStudent(std, id), HttpStatus.OK);
    }
}
