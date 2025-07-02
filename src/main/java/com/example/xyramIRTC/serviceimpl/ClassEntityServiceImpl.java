package com.example.xyramIRTC.serviceimpl;

import com.example.xyramIRTC.dao.ClassEntityDao;
import com.example.xyramIRTC.model.ClassEntity;
import com.example.xyramIRTC.payloads.ClassEntityDto;
import com.example.xyramIRTC.service.ClassEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassEntityServiceImpl implements ClassEntityService {

    @Autowired
    private ClassEntityDao classEntityDao;

    @Override
    public ClassEntityDto createClassEntity(ClassEntityDto classEntityDto) {
        ClassEntity classEntity = new ClassEntity();
        ClassEntity savedClassEntity = classEntityDao.save(classEntity);
        return this.classEntityToDto(savedClassEntity);

    }

    private ClassEntity dtoToClassEntity(ClassEntityDto classEntityDto) {
        ClassEntity classEntity = new ClassEntity();

        return classEntity;
    }


    private ClassEntityDto classEntityToDto(ClassEntity classEntity) {
        ClassEntityDto classEntityDto = new ClassEntityDto();

        return classEntityDto;
    }
}
