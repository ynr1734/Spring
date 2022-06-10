package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;

@RestController
public class AJAXController {
	
	@Autowired
	CustBiz biz;
	
	@RequestMapping
	public String checkid(String id) {
		String result = "";
		CustVO c = null;
		
		try {
			c = biz.get(id);
			if(c == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@Autowired
	CateBiz catebiz;
	
	@RequestMapping("catecheckid")
	public String catecheckid(String id) {
		String result = "";
		CateVO c = null;
		
		if(id.equals("") || id == null) {
			return "1";
		}
		
		try {
			c = catebiz.get(Integer.parseInt(id));
			if(c == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
