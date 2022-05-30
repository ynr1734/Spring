package com.item;

import java.util.List;

import com.frame.Dao;
import com.frame.Service;
import com.vo.ItemVO;

public class ItemService implements Service<Integer, ItemVO> {

	Dao<Integer, ItemVO> dao;
	
	public Dao<Integer, ItemVO> getDao() {
		return dao;
	}

	public void setDao(Dao<Integer, ItemVO> dao) {
		this.dao = dao;
	}

	@Override
	public void register(ItemVO v) {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) {
		dao.delete(k);
	}

	@Override
	public void modify(ItemVO v) {
		dao.update(v);
	}

	@Override
	public ItemVO get(Integer k) {
		return dao.select(k);
	}

	@Override
	public List<ItemVO> get() {
		return dao.select();
	}


}
