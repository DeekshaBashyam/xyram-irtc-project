package com.example.xyramIRTC.payloads;

import java.time.LocalDateTime;

public class TrainDto {
    private int trainCode;
    private String distance;
    private String trainName;
    private LocalDateTime trainStartTime;
    private LocalDateTime trainEndTime;

    public int getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(int trainCode) {
        this.trainCode = trainCode;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public LocalDateTime getTrainStartTime() {
        return trainStartTime;
    }

    public void setTrainStartTime(LocalDateTime trainStartTime) {
        this.trainStartTime = trainStartTime;
    }

    public LocalDateTime getTrainEndTime() {
        return trainEndTime;
    }

    public void setTrainEndTime(LocalDateTime trainEndTime) {
        this.trainEndTime = trainEndTime;
    }

    public String getStartStationCode() {
        return startStationCode;
    }

    public void setStartStationCode(String startStationCode) {
        this.startStationCode = startStationCode;
    }

    public String getEndStationCode() {
        return endStationCode;
    }

    public void setEndStationCode(String endStationCode) {
        this.endStationCode = endStationCode;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    private String startStationCode;
    private String endStationCode;
    private String frequency;
}
