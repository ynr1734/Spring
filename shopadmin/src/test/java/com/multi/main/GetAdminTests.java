package com.multi.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;
import com.multi.vo.AdminVO;

@SpringBootTest
class GetAdminTests {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		AdminVO admin = null;
		try {
			admin = biz.getAdmin("admin");
			System.out.println(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


