package com.MrZ.mrz.interfaces;

import com.MrZ.mrz.entities.AZ_enterprise;
import com.MrZ.mrz.entities.Outlet;

import java.util.List;

public interface IAzEnterpriseService {

    List<AZ_enterprise> findAllEnterprise();

    List<Outlet> getListOfOutlet(int azId);
}
