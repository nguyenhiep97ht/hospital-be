package com.example.hospitalbe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalbe.data.Physician;
import com.example.hospitalbe.model.PhysicianDTO;
import com.example.hospitalbe.service.PhysicianService;

@RestController
@RequestMapping(path = "/api")
public class PhysicianController {

    @Autowired
    private PhysicianService physicianService;

    @GetMapping(value = "/physicians")
    public List<PhysicianDTO> findAllPhysicians() {
        try {
            List<Physician> physicians = new ArrayList<>();
            List<PhysicianDTO> physicianDTOs = new ArrayList<>();
            physicians = physicianService.findAll();
            for(Physician p : physicians) {
                PhysicianDTO physicianDTO = new PhysicianDTO();
                physicianDTO.setId(p.getId());
                physicianDTO.setName(p.getName());
                physicianDTO.setPosition(p.getPosition());
                physicianDTO.setSsn(p.getSsn());
                physicianDTOs.add(physicianDTO);
            }

            return physicianDTOs;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
}
