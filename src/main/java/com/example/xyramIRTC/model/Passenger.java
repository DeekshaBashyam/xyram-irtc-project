package com.example.xyramIRTC.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int passengerId;
    private Integer srlNo;
    private String passengerName;
    private String gender;
    private String passengerAge;

    private String seatNumber;
    private double fare;

    @Column(name = "pnrNo")
    private Long pnrNo;

    public Long getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(Long pnrNo) {
        this.pnrNo = pnrNo;
    }

    @ManyToOne

    @JoinColumn(name = "pnrNo", referencedColumnName = "pnrNo", insertable = false, updatable = false)
    private TicketReservation ticketReservation;


    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public Integer getSrlNo() {
        return srlNo;
    }

    public void setSrlNo(Integer srlNo) {
        this.srlNo = srlNo;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(String passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public TicketReservation getTicketReservation() {
        return ticketReservation;
    }

    public void setTicketReservation(TicketReservation ticketReservation) {
        this.ticketReservation = ticketReservation;
    }
}
