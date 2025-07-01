package com.example.xyramIRTC.controllers;


import com.example.xyramIRTC.payloads.TrainDto;
import com.example.xyramIRTC.service.TrainService;
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

    @PostMapping("/add-train")
    public ResponseEntity<TrainDto> createTrain(@RequestBody TrainDto trainDto){
        TrainDto createdTrainDto = trainService.createTrain(trainDto);
        return new ResponseEntity<>(createdTrainDto, HttpStatus.CREATED);
    }







}
