package com.example.xyramIRTC.serviceimpl;

import com.example.xyramIRTC.exception.ResourceNotFoundException;
import com.example.xyramIRTC.model.Passenger;
import com.example.xyramIRTC.model.TicketReservation;
import com.example.xyramIRTC.dao.TicketReservationDao;
import com.example.xyramIRTC.payloads.PassengerDto;
import com.example.xyramIRTC.payloads.TicketReservationDto;
import com.example.xyramIRTC.service.TicketReservationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TicketReservationServiceImpl implements TicketReservationService {

    @Autowired
    private TicketReservationDao ticketReservationDao;

    @Autowired
    private ModelMapper modelMapper;

//
//    @Override
//    public TicketReservationDto createTicketReservation(TicketReservationDto ticketReservationDto){
//        TicketReservation ticketReservation = this.dtoToTicketReservation(ticketReservationDto);
//        TicketReservation savedTicketReservation = this.ticketReservationDao.save(ticketReservation);
//        return this.ticketReservationToDto(savedTicketReservation);
//    }

    @Override
    public TicketReservationDto createTicketReservation(TicketReservationDto ticketReservationDto) {

        TicketReservation ticketReservation = this.dtoToTicketReservation(ticketReservationDto);


        TicketReservation savedTicketReservation = this.ticketReservationDao.save(ticketReservation);

        return this.ticketReservationToDto(savedTicketReservation);
    }

    private Long generatePNR() {
        String uuid = UUID.randomUUID().toString();
        String digitsOnly = uuid.replaceAll("[^0-9]", "");
        String pnrPart = digitsOnly.substring(0, 10);
        return Long.parseLong(pnrPart);
    }



    @Override
    public TicketReservationDto updateTicketReservation(TicketReservationDto dto, Long pnrNo) {
        TicketReservation ticketReservation = this.ticketReservationDao.findById(pnrNo)
                .orElseThrow(() -> new ResourceNotFoundException("TicketReservation", "pnrNo", pnrNo));


        ticketReservation.setTrainCode(dto.getTrainCode());
        ticketReservation.setFromStation(dto.getFromStation());
        ticketReservation.setToStation(dto.getToStation());
        ticketReservation.setFromDate(dto.getFromDate());
        ticketReservation.setToDate(dto.getToDate());
        ticketReservation.setFromKm(dto.getFromKm());
        ticketReservation.setToKm(dto.getToKm());

        TicketReservation updated = ticketReservationDao.save(ticketReservation);
        return ticketReservationToDto(updated);
    }


    @Override
    public List<TicketReservationDto> getAllTicketReservation() {
        List<TicketReservation> ticketReservations = this.ticketReservationDao.findAll();
        List<TicketReservationDto> ticketReservationDtos = ticketReservations.stream().map(ticketReservation -> this.ticketReservationToDto(ticketReservation)).collect(Collectors.toList());
        return ticketReservationDtos;
    }

@Override
public TicketReservationDto getTicketReservationByPnrNo(Long pnrNo) {
    TicketReservation ticketReservation = this.ticketReservationDao.findById(pnrNo)
            .orElseThrow(() -> new ResourceNotFoundException("TicketReservation", "pnrNo", pnrNo));
return this.ticketReservationToDto(ticketReservation);


}

    @Override
    public void deleteTicketReservation(Long pnrNo) {
        TicketReservation ticketReservation = this.ticketReservationDao.findById(pnrNo)
                .orElseThrow(() -> new ResourceNotFoundException("TicketReservation", "pnrNo", pnrNo));

        this.ticketReservationDao.delete(ticketReservation);
    }


//    @Override
//    public List<PassengerDto> getPassengersByPnr(Integer pnrNo) {
//        TicketReservation ticket = ticketReservationDao.findById(pnrNo)
//                .orElseThrow(() -> new RuntimeException("PNR not found: " + pnrNo));
//
//        List<Passenger> passengerList = ticket.getPassenger();
//
//        return passengerList.stream()
//                .map(this::passengerToDto)
//                .collect(Collectors.toList());
//    }





//    private TicketReservation dtoToTicketReservation(TicketReservationDto ticketReservationDto){
//TicketReservation ticketReservation =this.modelMapper.map(ticketReservationDto, TicketReservation.class);
//        return ticketReservation;
//
//    }

    private TicketReservation dtoToTicketReservation(TicketReservationDto dto) {
        TicketReservation entity = this.modelMapper.map(dto, TicketReservation.class);
        entity.setPnrNo(generatePNR());
        return entity;
    }



    private TicketReservationDto ticketReservationToDto(TicketReservation ticketReservation){
        TicketReservationDto ticketReservationDto = this.modelMapper.map(ticketReservation, TicketReservationDto.class);
        return ticketReservationDto;
    }


//    public PassengerDto passengerToDto(Passenger passenger) {
//        PassengerDto dto = new PassengerDto();
//
//        return dto;
//    }

}
