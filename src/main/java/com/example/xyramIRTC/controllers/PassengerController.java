package com.example.xyramIRTC.controllers;

import com.example.xyramIRTC.payloads.ApiResponse;
import com.example.xyramIRTC.payloads.PassengerDto;
import com.example.xyramIRTC.service.PassengerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/")
    public ResponseEntity<PassengerDto> createPassenger(@Valid @RequestBody PassengerDto passengerDto) {
        PassengerDto createPassengerDto = this.passengerService.createPassenger(passengerDto);
        return new ResponseEntity<>(createPassengerDto, HttpStatus.CREATED);
    }

    @PutMapping("/{passengerId}")
    public ResponseEntity<PassengerDto> updatePassenger(
            @PathVariable("passengerId") Integer passengerId,
            @RequestBody PassengerDto passengerDto) {
        PassengerDto updatedPassenger = this.passengerService.updatePassenger(passengerDto, passengerId);
        return ResponseEntity.ok(updatedPassenger);

    }



    @GetMapping("/{passengerId}")
    public ResponseEntity<PassengerDto> getPassengerById(@PathVariable("passengerId") Integer passengerId) {

        return ResponseEntity.ok(this.passengerService.getPassengerById(passengerId));


    }

    @GetMapping("/")
    public ResponseEntity<List<PassengerDto>> getAllPassengers(){

        return ResponseEntity.ok(this.passengerService.getAllPassengers());
    }

    @DeleteMapping("/{passengerId}")
    public ResponseEntity<ApiResponse> deletePassenger(@PathVariable("passengerId") Integer passengerId) {
        this.passengerService.deletePassenger(passengerId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Passenger deleted successfully", true), HttpStatus.OK);
    }











}
