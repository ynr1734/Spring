package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustInsertTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO obj = new CustVO("id01","lee","Seoul","pwd01");
		try {
			biz.register(obj);
			System.out.println("Register OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


