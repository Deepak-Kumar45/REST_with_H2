package com.spring.rest_with_h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest_with_h2.entity.Student;
import java.util.List;



@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
    List<Student> findByStdMail(String stdMail);
}
