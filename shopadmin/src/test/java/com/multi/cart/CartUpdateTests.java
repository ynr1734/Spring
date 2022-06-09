package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class CartUpdateTests {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		CartVO c = new CartVO("id23", 10, 20);
		try {
			biz.modify(c);
			System.out.println("Modified OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


