package com.spring.pr.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE Ins (
	INS_NUM	NUMBER(30)	NOT NULL,
	INS_NAME	VARCHAR(30)	NOT NULL,
	INS_PHONE	VARCHAR(30)	NOT NULL,
	INS_FAXNUM	VARCHAR(30)	NOT NULL,
	INS_ADDR	VARCHAR(50)	NOT NULL,
	INS_ADDR_DETAIL	VARCHAR(50)	NOT NULL,
	INS_RGSTR	DATE DEFAULT sysdate	NOT NULL,
	INS_RLS	DATE	NULL,
	JOINID	VARCHAR(255)	NOT NULL
	INSSOCNUM VARCHAR2(20)
);
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InsVO {
	
	private int InsNum;
	private String InsName;
	private String InsPhone;
	private String InsFaxNum;
	private String InsAddr;
	private String InsAddrDetail;
	private Timestamp InsRgstr;
	private Timestamp InsRls;
	private String JoinId;
	private String InsSocNum;
	
}
