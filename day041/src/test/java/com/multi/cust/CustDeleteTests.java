package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustDeleteTests {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove("id88");
			System.out.println("Removed OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
