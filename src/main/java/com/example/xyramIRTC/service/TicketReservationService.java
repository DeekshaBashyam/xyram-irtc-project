package com.example.xyramIRTC.service;


import com.example.xyramIRTC.payloads.PassengerDto;
import com.example.xyramIRTC.payloads.TicketReservationDto;

import java.util.List;

public interface TicketReservationService {

    TicketReservationDto createTicketReservation(TicketReservationDto ticketReservationDto);

    TicketReservationDto updateTicketReservation(TicketReservationDto ticketReservationDto, Long pnrNo);
    List<TicketReservationDto> getAllTicketReservation();
    TicketReservationDto getTicketReservationByPnrNo(Long pnrNo);
    void deleteTicketReservation(Long pnrNo);
    //List<PassengerDto> getPassengersByPnr(Integer pnrNo);





}
