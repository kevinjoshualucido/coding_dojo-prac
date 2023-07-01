package com.practice.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("")
	public String dashboard(Model model) {
		return "dashboard.jsp";
	}
	
	@RequestMapping("/date")
	public String dateFormat(Model model) {
		Date date = new Date();
		
		model.addAttribute(date);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String timeFormat(Model model) {
		Date date = new Date();
		
		model.addAttribute(date);
		
		return "time.jsp";
	}
}
