package com.example.xyramIRTC.serviceimpl;

import com.example.xyramIRTC.dao.ZoneDao;
import com.example.xyramIRTC.model.Zone;
import com.example.xyramIRTC.payloads.ZoneDto;
import com.example.xyramIRTC.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneServiceImpl implements ZoneService {


    @Autowired
    private ZoneDao zoneDao;

    @Override
    public ZoneDto createZone(ZoneDto zoneDto){
        Zone zone = this.dtoToZone(zoneDto);
        Zone savedZone = zoneDao.save(zone);
        return this.zoneToDto(savedZone);
    }

    private Zone dtoToZone(ZoneDto zoneDto){
        Zone zone = new Zone();
        return zone;
    }

    private ZoneDto zoneToDto(Zone zone){
        ZoneDto zoneDto = new ZoneDto();
        return zoneDto;
    }
}
