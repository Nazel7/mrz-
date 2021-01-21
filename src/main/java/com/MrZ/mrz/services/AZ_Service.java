package com.MrZ.mrz.services;

import com.MrZ.mrz.entities.AZ_enterprise;
import com.MrZ.mrz.entities.Outlet;
import com.MrZ.mrz.interfaces.IAzEnterpriseService;
import com.MrZ.mrz.repositories.AZ_enterpriseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AZ_Service implements IAzEnterpriseService {
    @Autowired
    private AZ_enterpriseRepo az_enterpriseRepo;

    @Override
    public List<AZ_enterprise> findAllEnterprise() {

        return az_enterpriseRepo.getAllAzEnterprise();
    }

    @Override
    public List<Outlet> getListOfOutlet(int azId) {

        return az_enterpriseRepo.getListOfOutLets(azId);
    }
}
