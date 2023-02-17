package com.example.hospitalbe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hospitalbe.data.Physician;

@Repository
public interface PhysicianRepository  extends JpaRepository<Physician, Long> {
    
}
