package com.example.xyramIRTC.serviceimpl;

import com.example.xyramIRTC.dao.ViaDetailsDao;
import com.example.xyramIRTC.model.ViaDetails;
import com.example.xyramIRTC.payloads.ViaDetailsDto;
import com.example.xyramIRTC.service.ViaDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaDetailsServiceImpl implements ViaDetailsService {

    @Autowired
    private ViaDetailsDao viaDetailsDao;


    @Override
    public ViaDetailsDto createViaDetails(ViaDetailsDto viaDetailsDto){
        ViaDetails viaDetails = this.dtoToViaDetails(viaDetailsDto);
        ViaDetails savedViaDetails = viaDetailsDao.save(viaDetails);
        return this.viaDetailsToDto(savedViaDetails);
    }

    private ViaDetails dtoToViaDetails(ViaDetailsDto viaDetailsDto){
        ViaDetails viaDetails = new ViaDetails();
        return viaDetails;
    }

    private ViaDetailsDto viaDetailsToDto(ViaDetails viaDetails){
        ViaDetailsDto viaDetailsDto = new ViaDetailsDto();
        return viaDetailsDto;

    }

}
