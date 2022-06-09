package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@RequestMapping("/select")
	public String select(Model m) {
		m.addAttribute("center", "product/select");
		return "/index";
	}

}
