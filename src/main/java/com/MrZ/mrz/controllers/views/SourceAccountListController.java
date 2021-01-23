package com.MrZ.mrz.controllers.views;

import com.MrZ.mrz.entities.Outlet;
import com.MrZ.mrz.entities.SourceAccountList;
import com.MrZ.mrz.entities.Transaction;
import com.MrZ.mrz.interfaces.IOutletService;
import com.MrZ.mrz.interfaces.ISourceAccountListService;
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
public class SourceAccountListController {

    @Autowired
    private ISourceAccountListService iSourceAccountListService;

    @Autowired
    private IOutletService outletService;

    @Autowired
    private ITransactionService transactionService;

    @GetMapping("/payment/form")
    public String getSourceAccountList(Model model){
        List<SourceAccountList> sourceAccountLists= iSourceAccountListService.findAllSourceAList();

            model.addAttribute("sourceList", sourceAccountLists);

            return "payment";

    }

    @PostMapping("/payment/mocktransaction")
    public String postPayment(@RequestParam("source") String sourceAccount,
                            @RequestParam("payer") String payer,
                            @RequestParam("amount") int amount) {
        Outlet outlet= outletService.getOutletByAccountNo(sourceAccount);
         List<Transaction> transactions= transactionService.getTransactionByAc_outletId(outlet.getId());
        Transaction transaction = new Transaction();
         int lastIndex;
         if(transactions.size() == 0){
             transaction.setBalance(amount);
         }else {

             lastIndex= transactions.size()-1;
             System.out.println(transactions.size()-1);
             Transaction transaction1= transactions.get(lastIndex);
             int newAmount= transaction1.getBalance() + amount;
             transaction.setBalance(newAmount);
         }
        if (!payer.isBlank()|| amount < 0 ) {
            transaction.setSourceAccount(sourceAccount);
            transaction.setDate(new Date());
            transaction.setPayer(payer);
            transaction.setAc_outlet(outlet);
            transaction.setPayment(amount);
            System.out.println(transaction.getBalance());

            transactionService.saveTransaction(transaction);

            return "redirect:/dashboard/az-Enterprise";
        }

            return "redirect:/sourceac-list";

    }
}
