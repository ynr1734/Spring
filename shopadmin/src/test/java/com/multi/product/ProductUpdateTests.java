package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductUpdateTests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO p = new ProductVO("levis",10000,11,"1.jpg");
		try {
			biz.modify(p);
			System.out.println("Modified OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


