package com.item;

import java.util.ArrayList;
import java.util.List;

import com.frame.Dao;
import com.vo.ItemVO;

public class ItemDao implements Dao<Integer, ItemVO> {

	@Override
	public void insert(ItemVO v) {
		System.out.println("Inserted:"+v);
	}

	@Override
	public void delete(Integer k) {
		System.out.println("Deleted:"+k);
	}

	@Override
	public void update(ItemVO v) {
		System.out.println("Updated:"+v);
	}

	@Override
	public ItemVO select(Integer k) {
		ItemVO i = new ItemVO(k,"wallet",10000);
		return i;
	}

	@Override
	public List<ItemVO> select() {
		ArrayList<ItemVO> list = new ArrayList<ItemVO>();
		list.add(new ItemVO(1, "pants1", 1000));
		list.add(new ItemVO(2, "pants2", 2000));
		list.add(new ItemVO(3, "pants3", 3000));
		list.add(new ItemVO(4, "pants4", 4000));
		list.add(new ItemVO(5, "pants5", 5000));
		
		return list;
	}

}
