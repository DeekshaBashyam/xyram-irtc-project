package com.example.xyramIRTC.payloads;

import java.util.Date;
import java.util.List;

public class TicketReservationDto {


    private Long pnrNo;
    private String trainCode;
    private String fromStation;
    private String toStation;
    private Date fromDate;
    private Date toDate;
    private String fromKm;
    private String toKm;


    private List<PassengerDto> passenger;

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

    public List<PassengerDto> getPassenger() {
        return passenger;
    }

    public void setPassenger(List<PassengerDto> passenger) {
        this.passenger = passenger;
    }


}
