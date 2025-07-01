package com.example.xyramIRTC.dao;

import com.example.xyramIRTC.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PassengerDao extends JpaRepository<Passenger, Integer> {

    long countByPnrNo(Long pnrNo);


}
