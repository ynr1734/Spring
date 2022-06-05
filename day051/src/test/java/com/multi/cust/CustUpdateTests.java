package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustUpdateTests {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO c = new CustVO("id23", "pwd24", "keeee");
		try {
			biz.modify(c);
			System.out.println("Modified OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
