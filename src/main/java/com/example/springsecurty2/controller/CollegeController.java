package com.example.springsecurty2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurty2.entiy.College;
import com.example.springsecurty2.repostory.CollegeRepository;


@RestController
@RequestMapping("/api/college") 
public class CollegeController {

    @Autowired
    private CollegeRepository collegeRepository;

    @GetMapping("/hi")
    public String hi() {
        return "Hi Welcome to School";
    }

    @GetMapping("/fetchall")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<List<College>> fetchAll() {
        List<College> colleges = collegeRepository.findAll();
        return new ResponseEntity<>(colleges, HttpStatus.OK);
    }

    @GetMapping("/fetch/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<College> fetch(@PathVariable Long id) {
        College college = collegeRepository.findById(id).orElse(null);
        if (college != null) {
            return new ResponseEntity<>(college, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

