package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductBiz pbiz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		mv.addObject("center", "product/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		mv.addObject("center", "product/register");
		return mv;
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv,ProductVO obj) {
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		try {
			pbiz.register(obj);
			int cnt = pbiz.getcnt();
			mv.addObject("cnt", cnt);
			mv.addObject("center", "product/registerok");
		} catch (Exception e) {
			mv.addObject("center", "product/registerfail");
		}
		return mv;
	}
	
	@RequestMapping("/select")
	public ModelAndView select(ModelAndView mv) {
		List<ProductVO> list = null;
		try {
			list = pbiz.get();
			mv.addObject("left", "product/left");
			mv.addObject("center", "product/select");
			mv.addObject("allproduct", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(ModelAndView mv, Integer id) {
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		ProductVO p = null;
		try {
			p = pbiz.get(id);
			mv.addObject("center", "product/detail");
			mv.addObject("dproduct", p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
		
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		try {
			pbiz.remove(id);
		} catch (Exception e) {
				
		}
		return "redirect:select";
		}
	
	@RequestMapping("/update")
	public ModelAndView update(ModelAndView mv, Integer id) {
		ProductVO p = null;
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		try {
			p = pbiz.get(id);
			mv.addObject("uproduct", p);
			mv.addObject("center", "product/update");
		} catch (Exception e) {
					
		}
			return mv;
		}
	
	@RequestMapping("/updateimpl")
	public String updateimpl(ProductVO p) {
		try {
			pbiz.modify(p);
		} catch (Exception e) {
				
		}
		return "redirect:detail?id="+p.getId();
	}
	
}