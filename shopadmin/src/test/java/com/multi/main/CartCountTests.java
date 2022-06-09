package com.multi.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;

@SpringBootTest
class CartCountTests {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		int count;
		try {
			count = biz.getCartCnt();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


