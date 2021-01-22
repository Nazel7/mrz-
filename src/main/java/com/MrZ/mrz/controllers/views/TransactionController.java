package com.MrZ.mrz.controllers.views;

import com.MrZ.mrz.entities.Transaction;
import com.MrZ.mrz.interfaces.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TransactionController {
    @Autowired
    ITransactionService service;

    @GetMapping("/enterprise/show-all-transaction")
    public String getAllTransactionDetails(Model model) {
        List<Date> dates = service.getDateList();

        model.addAttribute("dates", dates);

        return "transaction-form";
    }

    @PostMapping("/transaction/dateoutput")
    public String postTransaction(@RequestParam("date1") String date,
                                  @RequestParam("date2") String date22,
                                  Model model) throws Exception{

//        String d= "2021/06/01";

        String dateClone= date.substring(0, 10);
        String dateClone1= date22.substring(0, 10);
        String newDateClone= dateClone.replaceAll("-", "/");
        String newDateClone2= dateClone1.replaceAll("-", "/");

        Date d= new SimpleDateFormat("yyyy/MM/dd").parse(newDateClone);
        Date dd= new SimpleDateFormat("yyyy/MM/dd").parse(newDateClone2);


        List<Transaction> transactions = service.getTransactionByDates(d, dd);
        if(transactions.size() == 0){
            List<Transaction> transactions1= service.getTransactionByIndexZero(dd);
            model.addAttribute("transactionByDate", transactions1);
            return "transaction-by-date-time";
        }
        System.out.println(transactions.get(0).getBalance());
        model.addAttribute("transactionByDate", transactions);

        return "transaction-by-date-time";

    }

}
