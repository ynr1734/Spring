package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductInsertTests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		//(NULL, 'levis', 10000, curdate(), 11, 'a.jpg')
		ProductVO obj = new ProductVO("levis",10000,11,"1.jpg");
		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


