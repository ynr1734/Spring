package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;

@SpringBootTest
class CateSelectTests {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.get(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}

}


