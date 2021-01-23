package com.MrZ.mrz.controllers.views;

import com.MrZ.mrz.entities.Transaction;
import com.MrZ.mrz.interfaces.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OutletController {
    @Autowired
    ITransactionService iTransactionService;


}
