package com.example.xyramIRTC.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class TrainFare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "train_code")
    private String trainCode;

    @Column(name = "class_id")
    private Long classId;

    @Column(name = "from_km")
    private Double fromKm;

    @Column(name = "to_km")
    private Double toKm;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column(name = "fare")
    private Double fare;




}
