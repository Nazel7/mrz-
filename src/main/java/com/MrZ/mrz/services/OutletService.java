package com.MrZ.mrz.services;

import com.MrZ.mrz.entities.Outlet;
import com.MrZ.mrz.interfaces.IOutletService;
import com.MrZ.mrz.repositories.OutletRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutletService implements IOutletService {

    @Autowired
    private OutletRepo outletRepo;
    @Override
    public Outlet getOutletByAccountNo(String accountNo) {

        return outletRepo.getOutletsByAccountNo(accountNo);
    }
}
