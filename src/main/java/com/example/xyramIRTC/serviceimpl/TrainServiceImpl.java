package com.example.xyramIRTC.serviceimpl;

import com.example.xyramIRTC.dao.TrainDao;
import com.example.xyramIRTC.model.Train;
import com.example.xyramIRTC.payloads.TrainDto;
import com.example.xyramIRTC.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainDao trainDao;

    @Override
    public TrainDto createTrain(TrainDto trainDto) {
        Train train = this.dtoToTrain(trainDto);
        Train savedTrain = trainDao.save(train);
        return this.trainToDto(savedTrain);
    }


    private Train dtoToTrain(TrainDto trainDto) {
        Train train = new Train();
//        train.setDistance(trainDto.getDistance());
//        train.setTrainName(trainDto.getTrainName());
//        train.setTrainStartTime(trainDto.getTrainStartTime());
//        train.setTrainEndTime(trainDto.getTrainEndTime());
//        train.setStartStationCode(trainDto.getStartStationCode());
//        train.setEndStationCode(trainDto.getEndStationCode());
//        train.setFrequency(trainDto.getFrequency());
        return train;
    }

    private TrainDto trainToDto(Train train) {
        TrainDto trainDto = new TrainDto();
        trainDto.setTrainCode(train.getTrainCode());
        trainDto.setDistance(train.getDistance());
        trainDto.setTrainName(train.getTrainName());
        trainDto.setTrainStartTime(train.getTrainStartTime());
        trainDto.setTrainEndTime(train.getTrainEndTime());
        trainDto.setStartStationCode(train.getStartStationCode());
        trainDto.setEndStationCode(train.getEndStationCode());
        trainDto.setFrequency(train.getFrequency());
return  trainDto;
    }
}
