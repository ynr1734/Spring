package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.vo.ItemVO;

public class ItemGetDateTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
//		Service<Integer, ItemVO> service = 
//				(Service<Integer, ItemVO>) factory.getBean("iservice");
	
		ItemService service =
				(ItemService) factory.getBean("iservice");
		
		
		List<ItemVO> list = null;
		try {
			list = service.getDate("2020-05-31");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (ItemVO itemVO : list) {
			System.out.println(itemVO);	
		}
		
	}

}
