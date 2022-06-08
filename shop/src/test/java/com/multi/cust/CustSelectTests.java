package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;

@SpringBootTest
class CustSelectTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.get("id08");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}

}


