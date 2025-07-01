package com.example.xyramIRTC.serviceimpl;

import com.example.xyramIRTC.dao.TicketReservationDao;
import com.example.xyramIRTC.payloads.PassengerDto;
import com.example.xyramIRTC.exception.ResourceNotFoundException;
import com.example.xyramIRTC.model.Passenger;
import com.example.xyramIRTC.dao.PassengerDao;
import com.example.xyramIRTC.model.TicketReservation;
import com.example.xyramIRTC.service.PassengerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerDao passengerdao;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private TicketReservationDao ticketReservationDao;

    @Override
    public PassengerDto createPassenger(PassengerDto passengerDto) {
        Passenger passenger = this.dtoToPassenger(passengerDto);


        Long pnrNo = passengerDto.getPnrNo();
        TicketReservation ticketReservation = ticketReservationDao.findByPnrNo(pnrNo)
                .orElseThrow(() -> new RuntimeException("TicketReservation not found with PNR: " + pnrNo));

        passenger.setTicketReservation(ticketReservation);

        Long count = passengerdao.countByPnrNo(pnrNo);
        passenger.setSrlNo(count.intValue() + 1);


        Passenger savedPassenger = passengerdao.save(passenger);
        return passengerToDto(savedPassenger);
    }


    @Override
    public PassengerDto getPassengerById(Integer passengerId) {
        Passenger passenger = this.passengerdao.findById(passengerId).orElseThrow(() -> new ResourceNotFoundException("passenger", "id", passengerId));
return this.passengerToDto(passenger);

    }

        @Override
    public PassengerDto updatePassenger(PassengerDto passengerDto, Integer passengerId) {
        Passenger passenger = this.passengerdao.findById(passengerId).orElseThrow(() -> new ResourceNotFoundException("Passenger", "id", passengerId));
passenger.setPassengerName(passengerDto.getPassengerName());
        passenger.setPassengerAge(passengerDto.getPassengerAge());
        passenger.setGender(passengerDto.getGender());
Passenger updatedPassenger = passengerdao.save(passenger);
PassengerDto passengerDto1 =passengerToDto(updatedPassenger);
return passengerDto1;
    }

@Override
public List<PassengerDto> getAllPassengers() {
    List<Passenger> passengers = this.passengerdao.findAll();
    List<PassengerDto> passengerDtos = passengers.stream().map(passenger -> this.passengerToDto(passenger)).collect(Collectors.toList());
    return passengerDtos;

    }

    @Override
    public Passenger deletePassenger(Integer id) {
        passengerdao.deleteById(id);
        return null;
    }

    private Passenger dtoToPassenger(PassengerDto passengerDto){
Passenger passenger = modelMapper.map(passengerDto, Passenger.class);
        return passenger;
    }

//    private PassengerDto passengerToDto(Passenger passenger){
//        PassengerDto passengerDto = modelMapper.map(passenger, PassengerDto.class);
//        return passengerDto;


    private PassengerDto passengerToDto(Passenger passenger){
        PassengerDto passengerDto = modelMapper.map(passenger, PassengerDto.class);

        if (passenger.getTicketReservation() != null) {
            passengerDto.setPnrNo(passenger.getTicketReservation().getPnrNo());
        }

        return passengerDto;
    }

}


