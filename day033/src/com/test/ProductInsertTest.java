package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class ProductInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,ProductVO> service = 
				(Service<Integer,ProductVO>) factory.getBean("pservice");
	
		ProductVO p = new ProductVO("pants05", 10000, 31);
		try {
			service.register(p);
		} catch (Exception e) {
			System.out.println("�Է� ������ �߻��Ͽ����ϴ�.");
			// e.printStackTrace();
		}
	}

}
