package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductSelectTests {
	
	@Autowired
	ProductBiz pbiz;
	
	@Test
	void contextLoads() {
		
		Integer k = 6;
		ProductVO p = null;
		try {
			p = pbiz.get(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p);
		
	}

}
