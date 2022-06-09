package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class CateUpdateTests {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO c = new CateVO(10, "skirts", 20);
		try {
			biz.modify(c);
			System.out.println("Modified OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


