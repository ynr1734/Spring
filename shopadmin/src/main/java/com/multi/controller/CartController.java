package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	CartBiz biz;
	
	@RequestMapping("select")
	public String select(Model m) {
		List<CartVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cart/select");
		return "/index";
	}
	
}
