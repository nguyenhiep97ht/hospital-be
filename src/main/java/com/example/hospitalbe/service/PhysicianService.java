package com.example.hospitalbe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalbe.data.Physician;
import com.example.hospitalbe.repository.PhysicianRepository;

@Service
public class PhysicianService {
    @Autowired
    private PhysicianRepository physicianRepository;

    public List<Physician> findAll() {
        return physicianRepository.findAll();
    }
}
