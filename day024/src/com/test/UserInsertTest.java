package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<String,UserVO> service = 
				(Service<String, UserVO>) factory.getBean("uservice");
	
		UserVO u = new UserVO("id10", "pwd10", "lee");
		service.register(u);
	}

}
