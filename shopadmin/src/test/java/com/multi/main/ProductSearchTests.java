package com.multi.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductSearchTests {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.searchProduct("s");
			for (ProductVO p : list) {
				System.out.println(p);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


