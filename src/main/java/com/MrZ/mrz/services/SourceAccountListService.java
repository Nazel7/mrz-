package com.MrZ.mrz.services;

import com.MrZ.mrz.entities.SourceAccountList;
import com.MrZ.mrz.interfaces.ISourceAccountListService;
import com.MrZ.mrz.repositories.SourceAccountListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourceAccountListService implements ISourceAccountListService {
    @Autowired
    private SourceAccountListRepo sourceAccountListRepo;


    @Override
    public List<SourceAccountList> findAllSourceAList() {

        return sourceAccountListRepo.findAllSourceAList();
    }
}
