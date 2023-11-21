package com.spring.rest_with_h2.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_std")
public class Std {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int stdId;
    private String firstName;
    private String lastName;
    private Date dob;
    private double fees;
    private String gaurdianName;
    private String gaurdianRelation;
    private String gaurdianMobileNo;
    private Date lastmodified;
}
