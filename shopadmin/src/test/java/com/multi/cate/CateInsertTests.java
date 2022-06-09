package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class CateInsertTests {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO obj = new CateVO(30, "skirts", 0);
		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


