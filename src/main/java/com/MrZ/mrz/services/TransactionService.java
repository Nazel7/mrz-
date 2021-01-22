package com.MrZ.mrz.services;

import com.MrZ.mrz.entities.Transaction;
import com.MrZ.mrz.interfaces.ITransactionService;
import com.MrZ.mrz.repositories.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionRepo transactionRepo;

    @Override
    public void saveTransaction(Transaction transaction) {

        transactionRepo.save(transaction);
    }

    @Override
    public List<Transaction> getTransactionByAc_outletId(int outletId) {

        return transactionRepo.getTransactionByAc_outletId(outletId);

    }

    @Override
    public List<Transaction> getTransactionByDates(Date date1, Date date2) {


        return transactionRepo.getTransactionByDates(date1, date2);
    }

    @Override
    public List<Transaction> getTransactionByIndexZero(Date date2) {


        return  transactionRepo.getTransactionByIndexZero(date2);
    }

    @Override
    public List<Date> getDateList() {

        return transactionRepo.getDateList();
    }
}
