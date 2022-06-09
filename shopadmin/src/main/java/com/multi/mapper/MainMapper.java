package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MainMapper {
	
	public int getcustcnt() throws Exception;
	public int getproductcnt() throws Exception;
	public int getcatecnt() throws Exception;
	public int getcartcnt() throws Exception;

}
