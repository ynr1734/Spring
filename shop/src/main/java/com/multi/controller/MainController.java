package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz cbiz;
	
	@Autowired
	CateBiz catebiz;
	
	@Autowired
	ProductBiz pbiz;
	
	@ModelAttribute("catelist")
	public List<CateVO> makemenu() {
		List<CateVO> catelist = null;
		try {
			catelist = catebiz.getmain();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return catelist;
	}
	
	
	@RequestMapping("/")
	public String main(Model m) {
		
		return "main";
	}
	
	@RequestMapping("getproduct")
	public String getproduct(Model m, int id, String name) {
		List<ProductVO> plist = null;
		try {
			plist = pbiz.selectproduct(id);
			m.addAttribute("center", "product");
			m.addAttribute("menu", name);
			m.addAttribute("plist", plist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	@RequestMapping("getcate")
	public String getcate(Model m, int id) {
		List<CateVO> catelist = null;
		try {
			catelist = catebiz.selectsub(id);
			m.addAttribute("leftcatelist", catelist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("center", "/register");
		return "main";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, CustVO cust, HttpSession session) {
		try {
			cbiz.register(cust);
			session.setAttribute("logincust", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "/register");
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center", "/login");
		return "main";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		CustVO cust = null;
		try {
			cust = cbiz.get(id);
			if(cust == null) {
				throw new Exception();
			}
			if(cust.getPwd().equals(pwd)) {
				session.setAttribute("logincust", cust);
			}else {
				throw new Exception();
			}
		}catch (Exception e) {
			return "redirect:/login";
		}
		return "main";
	}
	
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "main";
	}
	
	
}
