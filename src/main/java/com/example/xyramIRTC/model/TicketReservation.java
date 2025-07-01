package com.example.xyramIRTC.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TicketReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pnrNo;


    private String trainCode;
    private String fromStation;
    private String toStation;
    private Date fromDate;
    private Date toDate;
    private String fromKm;

    private String toKm;



    @OneToMany(mappedBy = "ticketReservation", cascade = CascadeType.ALL)

    private List<Passenger> passenger;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(Long pnrNo) {
        this.pnrNo = pnrNo;
    }

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getFromKm() {
        return fromKm;
    }

    public void setFromKm(String fromKm) {
        this.fromKm = fromKm;
    }

    public String getToKm() {
        return toKm;
    }

    public void setToKm(String toKm) {
        this.toKm = toKm;
    }

    public List<Passenger> getPassenger() {
        return passenger;
    }

    public void setPassenger(List<Passenger> passenger) {
        this.passenger = passenger;
    }



}
