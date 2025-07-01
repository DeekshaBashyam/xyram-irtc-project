package com.example.xyramIRTC.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Train {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int trainCode;
private String distance;
private String trainName;
private LocalDateTime trainStartTime;
private LocalDateTime trainEndTime;
private String startStationCode;
private String endStationCode;
private String frequency;

}
