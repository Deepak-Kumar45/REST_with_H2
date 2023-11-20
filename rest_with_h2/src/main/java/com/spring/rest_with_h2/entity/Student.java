package com.spring.rest_with_h2.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "tbl_student")
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stdId;
    private String stdName;
    private String stdMail;
    private String course;
    private double fees;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModified;
    public Student(String stdName, String stdMail, String course, double fees, Date lastModified) {
        this.stdName = stdName;
        this.stdMail = stdMail;
        this.course = course;
        this.fees = fees;
        this.lastModified = lastModified;
    }
    
}
