package com.MrZ.mrz.controllers.views;

import com.MrZ.mrz.interfaces.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class TransactionController {
    @Autowired
    ITransactionService service;

    @GetMapping("/enterprise/show-all-transaction")
    public String getAllTransactionDetails(Model model){
        List<Date> dates= service.getDateList();

        model.addAttribute("dates", dates);

        return "transaction-form";
    }

    @PostMapping("/transaction/dateoutput")
    public String postTransaction(@RequestParam("date1") Date date,
                                  @RequestParam("date2") Date date1){

        service.getTransactionByDates(date1, date1);

        return "transaction-by-date-time";

    }

}
