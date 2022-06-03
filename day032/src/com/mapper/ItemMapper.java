package com.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.vo.ItemVO;

public interface ItemMapper {
	public void insert(ItemVO obj) throws Exception;;
	public void delete(Integer k) throws Exception;;
	public void update(ItemVO obj) throws Exception;;
	
	public ItemVO select(Integer obj) throws Exception;;
	public List<ItemVO> selectall() throws Exception;;

	public List<ItemVO> searchname(String name) throws Exception;
	public List<ItemVO> getPrice(Map<String,Integer> map) throws Exception;
	public List<ItemVO> getDate(String date) throws Exception;
}
