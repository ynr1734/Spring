package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,ItemVO> service = 
				(Service<Integer,ItemVO>) factory.getBean("iservice");
	
		ItemVO i = new ItemVO("pants9", 30000, "pants6.jpg");
		try {
			service.register(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
