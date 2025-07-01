package com.example.xyramIRTC.dao;

import com.example.xyramIRTC.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainDao extends JpaRepository<Train, Integer> {
}
