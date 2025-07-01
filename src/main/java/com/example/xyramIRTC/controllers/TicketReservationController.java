package com.example.xyramIRTC.controllers;

import com.example.xyramIRTC.model.TicketReservation;
import com.example.xyramIRTC.payloads.ApiResponse;
import com.example.xyramIRTC.payloads.PassengerDto;
import com.example.xyramIRTC.payloads.TicketReservationDto;
import com.example.xyramIRTC.service.TicketReservationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket-reservation")
public class TicketReservationController {


    @Autowired
    private TicketReservationService ticketReservationService;

    @PostMapping("/")
    public ResponseEntity<TicketReservationDto> createTicketReservation(@RequestBody TicketReservationDto ticketReservationDto){
        TicketReservationDto createTicketReservationDto = ticketReservationService.createTicketReservation(ticketReservationDto);
        return new ResponseEntity<>(createTicketReservationDto, HttpStatus.CREATED);
    }

    @PutMapping("/{pnrNo}")
    public ResponseEntity<TicketReservationDto> updateTicketReservation(
            @Valid @RequestBody TicketReservationDto ticketReservationDto,
            @PathVariable("pnrNo") Long pnrNo) {

        TicketReservationDto updatedReservation = ticketReservationService.updateTicketReservation(ticketReservationDto, pnrNo);
        return ResponseEntity.ok(updatedReservation);
    }


    @GetMapping("/")
    public ResponseEntity<List<TicketReservationDto>> getAllTicketReservation(){
        return ResponseEntity.ok(this.ticketReservationService.getAllTicketReservation());
    }

    @GetMapping("/{pnrNo}")
    public ResponseEntity<TicketReservationDto> getTicketReservationByPnrNo(@PathVariable ("pnrNo") Long pnrNo){
        return ResponseEntity.ok(this.ticketReservationService.getTicketReservationByPnrNo(pnrNo));
    }

    @DeleteMapping("/{pnrNo}")
    public ResponseEntity<ApiResponse> deleteTicketReservation(@PathVariable("pnrNo") Long pnrNo){
        ticketReservationService.deleteTicketReservation(pnrNo);
        return new ResponseEntity<>(new ApiResponse("Ticket Reservation cancelled successfully", true), HttpStatus.OK);
    }


//    @GetMapping("/{pnrNo}/passengers")
//    public ResponseEntity<List<PassengerDto>> getPassengersByPnr(@PathVariable Integer pnrNo) {
//        List<PassengerDto> passengers = ticketReservationService.getPassengersByPnr(pnrNo);
//        return ResponseEntity.ok(passengers);
//    }



}
