package com.spring.pr.command;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class InsappVO {

	private UserDetailVO udVO;
	private UserBasicVO ubVO;
	private InsVO insVO;
}
