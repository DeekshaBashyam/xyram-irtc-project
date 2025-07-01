package com.example.xyramIRTC.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SeatAvailability {
    @Id
    private String trainCode;
    private int detailsId;
    private int noOfSeatsAvailable;
}
