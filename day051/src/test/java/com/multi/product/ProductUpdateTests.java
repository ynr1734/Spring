package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductUpdateTests {
	
	@Autowired
	ProductBiz pbiz;
	
	@Test
	void contextLoads() {
		ProductVO p = new ProductVO(0, "skirts2", 10000, null, 3.5);
		try {
			pbiz.modify(p);
			System.out.println("Modified OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
