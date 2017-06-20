package com.infotech.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/")
	public String welcomePage(){
		return "welcomePage";
	}
	
	@ModelAttribute
	public void modelData(Model model){
		model.addAttribute("welcomeMessage", "Welcome to www.infotech.net");
		model.addAttribute("headerMessage", "Welcome toInfotech.");
	}
	
	/*@RequestMapping(value="/")
	public String welcomePage(Map<String,Object> map){
		map.put("welcomeMessage", "Welcome to www.infotech.net");
		map.put("headerMessage", "Welcome toInfotech.");
		return "welcomePage";
	}*/
	/*@RequestMapping(value="/")
	public String welcomePage(Model model){
		model.addAttribute("welcomeMessage", "Welcome to www.infotech.net");
		model.addAttribute("headerMessage", "Welcome toInfotech.");
		return "welcomePage";
	}*/
}
