package com.MrZ.mrz.interfaces;

import com.MrZ.mrz.entities.Transaction;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ITransactionService {

    void saveTransaction(Transaction transaction);

    List<Transaction> getTransactionByAc_outletId(int outletId);

    List<Transaction> getTransactionByDates(Date date1, Date date2);

    List<Transaction> getTransactionByIndexZero(Date date2);

    List<Date> getDateList();
}
