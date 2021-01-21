package com.MrZ.mrz.controllers.views;

import com.MrZ.mrz.entities.AZ_enterprise;
import com.MrZ.mrz.entities.Outlet;
import com.MrZ.mrz.interfaces.IAzEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/dashboard")
public class AC_EnterpriseController {
    @Autowired
    private IAzEnterpriseService iAzEnterpriseService;

    @GetMapping("/az-Enterprise")
    public String homePage(Model model){
        List<AZ_enterprise> az_enterprises= iAzEnterpriseService.findAllEnterprise();
        if (az_enterprises != null){
            model.addAttribute("azEList", az_enterprises);

            return "az-enterprise";
        }
         return  null;

    }

    @GetMapping("/enterprise/listOfOutLets")
    public String getListOfOutlets(@RequestParam("enterpriseId") int enId, Model model){
        System.out.println(enId);
        List<Outlet> outlets= iAzEnterpriseService.getListOfOutlet(enId);
        System.out.println(outlets.get(1).getAccountNo());
        model.addAttribute("outlets", outlets);

        return "outlet-page";

    }

}
