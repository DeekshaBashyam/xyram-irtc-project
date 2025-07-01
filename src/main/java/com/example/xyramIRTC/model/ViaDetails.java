package com.example.xyramIRTC.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
@Table(name="via_details")
public class ViaDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "details_id")
    private Integer detailsId;
    @Column(name = "train_code")
    private String trainCode;
    @Column(name = "station_code")
    private String stationCode;
    @Column(name = "station_name")
    private String stationName;
    @Column(name = "from_origin")
    private String fromOrigin;
    @Column(name = "reach_time")
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
