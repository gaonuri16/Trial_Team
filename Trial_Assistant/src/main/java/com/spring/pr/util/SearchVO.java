package com.spring.pr.util;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchVO extends PageVO{
	
	private String keyword;
	private String condition;
	private int pageNum;
	
	public SearchVO() {
		this.pageNum = 1;
	}
}
