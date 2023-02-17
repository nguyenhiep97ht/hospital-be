package com.example.hospitalbe.data;

import java.io.Serializable;

import jakarta.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "physician")
@Data
public class Physician implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmployeeID")
    private Long id;

    // Mapping thông tin biến với tên cột trong Database
    @Column(name = "Name")
    private String name;


    @Column(name = "Position")
    private String position;
    
    @Column(name = "SSN")
    private Integer ssn;

}
