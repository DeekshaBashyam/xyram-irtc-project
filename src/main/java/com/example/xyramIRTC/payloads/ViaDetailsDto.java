package com.example.xyramIRTC.payloads;

import jakarta.persistence.Column;

import java.time.LocalTime;

public class ViaDetailsDto {

    private Integer detailsId;
    private String trainCode;
    private String stationCode;
    private String stationName;
    private String fromOrigin;
    private LocalTime reachTime;


    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getFromOrigin() {
        return fromOrigin;
    }

    public void setFromOrigin(String fromOrigin) {
        this.fromOrigin = fromOrigin;
    }

    public LocalTime getReachTime() {
        return reachTime;
    }

    public void setReachTime(LocalTime reachTime) {
        this.reachTime = reachTime;
    }
}
