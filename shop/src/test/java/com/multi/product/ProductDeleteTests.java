package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;

@SpringBootTest
class ProductDeleteTests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove(1005);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


