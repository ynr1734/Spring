package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.user.UserService;
import com.vo.UserVO;

public class USerSearchNameTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
//		Service<String, UserVO> service = 
//				(Service<String, UserVO>) factory.getBean("uservice");
	
		UserService service =
				(UserService) factory.getBean("uservice");
		
		
		List<UserVO> list = null;
		try {
			list = service.searchname("k");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (UserVO userVO : list) {
			System.out.println(userVO);	
		}
		
	}

}
