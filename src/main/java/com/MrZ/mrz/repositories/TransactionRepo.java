package com.MrZ.mrz.repositories;

import com.MrZ.mrz.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
   @Query("select t from Transaction  t where t.ac_outlet.id=?1")
    List<Transaction> getTransactionByAc_outletId(int outletId);

   @Query("select t from Transaction t where (t.date between  ?1 and ?2)")
   List<Transaction> getTransactionByDates(Date date1, Date date2);


   @Query("select d.date from Transaction d order by d.date")
    List<Date> getDateList();
}
