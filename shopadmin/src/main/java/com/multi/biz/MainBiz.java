package com.multi.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.mapper.MainMapper;

@Service
public class MainBiz {
	
	@Autowired
	MainMapper dao;
	
	public int getCustCnt() throws Exception {
		return dao.getcustcnt();
	}
	public int getProductCnt() throws Exception {
		return dao.getproductcnt();
	}
	public int getCateCnt() throws Exception {
		return dao.getcatecnt();
	}
	public int getCartCnt() throws Exception {
		return dao.getcartcnt();
	}
	
}
