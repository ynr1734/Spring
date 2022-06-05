package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;

@SpringBootTest
class ProductDeleteTests {
	
	@Autowired
	ProductBiz pbiz;
	
	@Test
	void contextLoads() {
		try {
			pbiz.remove(6);
			System.out.println("Removed OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
