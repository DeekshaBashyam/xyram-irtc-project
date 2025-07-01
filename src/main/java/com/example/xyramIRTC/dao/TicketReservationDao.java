package com.example.xyramIRTC.dao;

import com.example.xyramIRTC.model.TicketReservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketReservationDao extends JpaRepository<TicketReservation, Long> {
    Optional<TicketReservation> findByPnrNo(Long pnrNo);
}
