package com.example.xyramIRTC.service;

import com.example.xyramIRTC.payloads.PassengerDto;
import com.example.xyramIRTC.model.Passenger;

import java.util.List;

public interface PassengerService {
PassengerDto createPassenger(PassengerDto passengerDto);
PassengerDto getPassengerById(Integer id);
PassengerDto updatePassenger(PassengerDto passengerDto, Integer passengerId);
List<PassengerDto> getAllPassengers();
Passenger deletePassenger(Integer passengerId);


}
