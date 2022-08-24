package com.spring.pr.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicVO {
	
	/*
	CREATE TABLE UserBasic (
		JOINID	VARCHAR2(20)	NOT NULL,
		JOINSOCNUM	VARCHAR2(20)	NOT NULL,
		ANMNOSEQ	NUMBER(10) NULL,
		JOINPERSON	VARCHAR2(2) DEFAULT 0	NOT NULL	
	);
	*/

	private String JoinId;
	private String JoinSocNum;
	private int AnmNum;
	private String JoinPerson;
}
