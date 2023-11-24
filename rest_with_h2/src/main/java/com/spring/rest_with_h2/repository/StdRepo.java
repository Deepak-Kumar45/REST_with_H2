package com.spring.rest_with_h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest_with_h2.entity.Std;

public interface StdRepo extends JpaRepository<Std,Integer>{
    
}
