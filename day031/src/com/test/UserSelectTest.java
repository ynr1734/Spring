package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserSelectTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,UserVO> service = 
				(Service<String, UserVO>) factory.getBean("uservice");
	
		String k = "id02";
		UserVO u = null;
		try {
			u = service.get(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(u);
		
	}

}
