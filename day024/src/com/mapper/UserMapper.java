package com.mapper;

import java.util.List;

import com.vo.UserVO;

public interface UserMapper {
	public void insert(UserVO obj);
	public void delete(String obj);
	public void update(UserVO obj);

	public UserVO select(String obj);
	public List<UserVO> selectall();
	

	
}
