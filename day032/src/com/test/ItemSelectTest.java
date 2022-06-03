package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemSelectTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, ItemVO> service = 
				(Service<Integer, ItemVO>) factory.getBean("iservice");
	
		int k = 1002;
		ItemVO i = null;
		try {
			i = service.get(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(i);
		
	}

}
