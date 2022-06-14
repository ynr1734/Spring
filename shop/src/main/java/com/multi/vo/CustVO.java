package com.multi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustVO {
	private String id;
	private String name;
	private String addr;
	private Date regdate;
	private String pwd;
	
	public CustVO(String id, String name, String addr, String pwd) {
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.pwd = pwd;
	}

}
