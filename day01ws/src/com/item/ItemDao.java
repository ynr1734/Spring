package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVO;

public class ItemDao implements Dao<String, ItemVO> {

	@Override
	public void insert(ItemVO v) {
		System.out.println("Inserted:"+v);
	}

	@Override
	public void delete(String k) {
		System.out.println("Deleted:"+k);
	}

	@Override
	public void update(ItemVO v) {
		System.out.println("Updated:"+v);
	}

	@Override
	public ItemVO select(String k) {
		ItemVO item = new ItemVO(k,"wallet","10000");
		return null;
	}

	@Override
	public List<itemVO> select() {
		ArrayList<itemVO> list = new ArrayList<itemVO>();
		list.add(new itemVO("id01", "", "1000"));
		list.add(new itemVO("id02", "pwd02", "2000"));
		list.add(new itemVO("id03", "pwd03", "3000"));
		list.add(new itemVO("id04", "pwd04", "4000"));
		list.add(new itemVO("id05", "pwd05", "5000"));
		
		return null;
	}

}
