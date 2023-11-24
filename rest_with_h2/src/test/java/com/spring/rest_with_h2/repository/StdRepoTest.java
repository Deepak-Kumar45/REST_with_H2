package com.spring.rest_with_h2.repository;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.rest_with_h2.entity.Std;

@SpringBootTest
public class StdRepoTest {

    @Autowired
    private StdRepo stdRepo;

    @Test
    public void saveStd(){
        Std s1=Std.builder().firstName("Prashant").lastName("Singh")
                            .dob(new Date("23/02/2002")).fees(98234.22)
                            .gaurdianName("Anil kapoor").gaurdianRelation("Father")
                            .gaurdianMobileNo("928992002").lastmodified(new Date())
                            .build();
        Std s2=stdRepo.save(s1);
        System.err.println("Saved Object: "+s2);
    }

    @Test
    public void getStds(){
        System.out.println(stdRepo.findAll());
    }
}
