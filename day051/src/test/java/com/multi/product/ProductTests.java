package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.ProductVO;

@SpringBootTest
class ProductTests {

	@Test
	void contextLoads() {
		ProductVO p = new ProductVO(0,"pants10", 100000, null, 5.5);
		System.out.println(p);
		System.out.println(p.getName());
	}

}
