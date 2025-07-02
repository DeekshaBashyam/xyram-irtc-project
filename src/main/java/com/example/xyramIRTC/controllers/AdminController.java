package com.example.xyramIRTC.controllers;


import com.example.xyramIRTC.payloads.ClassEntityDto;
import com.example.xyramIRTC.payloads.TrainDto;
import com.example.xyramIRTC.payloads.ViaDetailsDto;
import com.example.xyramIRTC.payloads.ZoneDto;
import com.example.xyramIRTC.service.ClassEntityService;
import com.example.xyramIRTC.service.TrainService;
import com.example.xyramIRTC.service.ViaDetailsService;
import com.example.xyramIRTC.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private TrainService trainService;

    @Autowired
    private ClassEntityService classEntityService;

    @Autowired
    private ZoneService zoneService;

    @Autowired
    private ViaDetailsService viaDetailsService;

    @PostMapping("/add-train")
    public ResponseEntity<TrainDto> createTrain(@RequestBody TrainDto trainDto){
        TrainDto createdTrainDto = trainService.createTrain(trainDto);
        return new ResponseEntity<>(createdTrainDto, HttpStatus.CREATED);
    }

    @PostMapping("/add-classEntity")
    public ResponseEntity<ClassEntityDto> createClassEntity(@RequestBody ClassEntityDto classEntityDto){
        ClassEntityDto createdClassEntityDto = classEntityService.createClassEntity(classEntityDto);
        return new ResponseEntity<>(createdClassEntityDto, HttpStatus.CREATED);



    }


    @PostMapping("/add-zone")
    public ResponseEntity<ZoneDto> createZone(@RequestBody ZoneDto zoneDto){
        ZoneDto createdZoneDto = zoneService.createZone(zoneDto);
        return new ResponseEntity<>(createdZoneDto, HttpStatus.CREATED);
    }

    @PostMapping("/add=viaDetails")
    public ResponseEntity<ViaDetailsDto> createViaDetails(@RequestBody ViaDetailsDto viaDetailsDto){

        ViaDetailsDto createdViaDetailsDto = viaDetailsService.createViaDetails(viaDetailsDto);
        return new ResponseEntity<>(createdViaDetailsDto, HttpStatus.CREATED);

    }












}
