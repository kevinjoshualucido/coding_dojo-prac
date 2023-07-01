package com.practice.hopperreceipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReceiptController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Kevin Lucido";
        String itemName = "Silver";
        double price = 21.65;
        String description = "1 Troy Oz bullion at spot price.";
        String vendor = "Silver Online Coin Dealers";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("item", itemName);
        model.addAttribute("price", price);
        model.addAttribute("desc", description);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
    //...
    

}
