package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustSelectTests {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		
		String k = "id66";
		CustVO c = null;
		try {
			c = biz.get(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(c);
		
	}

}
