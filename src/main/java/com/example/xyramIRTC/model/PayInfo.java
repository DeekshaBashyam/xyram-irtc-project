package com.example.xyramIRTC.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PayInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int paymentId;

    private Long pnrNo;
    private int srlNo;
    private Date payDate;
    private double amount;
    private String payMode;
    private double instAmt;
    private String instType;
}
