package com.spring.pr.insapp.mapper;

import java.util.List;

import com.spring.pr.command.InsVO;
import com.spring.pr.command.InsappVO;
import com.spring.pr.command.TotalApplierVO;
import com.spring.pr.command.UserDetailVO;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

public interface IInsappMapper {

	//기관 신청자 정보 목록
	List<TotalApplierVO> getInsappList(SearchVO search);
	
	//총 기관 신청자 목록 수
	int getInsappTotal(PageVO paging);
	
	//기관 신청자 상세 보기
	TotalApplierVO getInsappContent(int ANum);
	
	//기관 신청자 수정(userdetail 테이블)
	void updateInsapp1(UserDetailVO vo);
	
	//기관 신청자 수정(ins 테이블)
	void updateInsapp2(InsVO vo);
	
	//기관 신청자 삭제(userdetail 테이블)
	void deleteInsapp1(String JoinSocNum);
	
	//기관 신청자 삭제(ins 테이블)
	void deleteInsapp2(int InsNum);
		
	//기관 신청자 삭제(userbasic 테이블)
	void deleteInsapp3(String JoinId);
}
