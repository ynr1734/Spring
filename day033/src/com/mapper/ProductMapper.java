package com.mapper;

import java.util.List;

import com.vo.ProductVO;

public interface ProductMapper {
	public void insert(ProductVO p) throws Exception;
	public void delete(Integer id) throws Exception;
	public void update(ProductVO p) throws Exception;
	
	public ProductVO select(Integer id) throws Exception;
	public List<ProductVO> selectall() throws Exception;

}
