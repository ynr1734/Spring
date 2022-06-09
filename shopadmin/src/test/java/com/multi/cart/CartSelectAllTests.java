package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class CartSelectAllTests {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		List<CartVO> list = null;
		try {
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (CartVO cartVO : list) {
			System.out.println(cartVO);
		}
	}

}


