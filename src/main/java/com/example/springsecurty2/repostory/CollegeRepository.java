package com.example.springsecurty2.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springsecurty2.entiy.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
    // No custom query methods needed for now
}
