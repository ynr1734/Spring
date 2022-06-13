package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.AdminVO;
import com.multi.vo.ProductVO;

@Repository
@Mapper
public interface MainMapper {
	
	public int getcustcnt() throws Exception;
	public int getproductcnt() throws Exception;
	public int getcatecnt() throws Exception;
	public int getcartcnt() throws Exception;
	public List<ProductVO> searchproduct(String txt) throws Exception;
	public AdminVO getadmin(String id) throws Exception;

}
