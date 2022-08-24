package com.spring.pr.unq.mapper;

import java.util.List;

import com.spring.pr.command.UnqualifyVO;

public interface IUnqMapper {
	
	//부적격자 등록(테스트)
	void UnqRegist(UnqualifyVO vo);

	//부적격자 목록
	List<UnqualifyVO> getUnqList();
	
	//총 부적격자 수
	int getUnqTotal();
	
	//부적격자 상세보기
	UnqualifyVO getUnqContent(String JoinId);
	
	//부적격자 수정
	void updateUnq(UnqualifyVO vo);
	
	//부적격자 삭제
	void deleteUnq(String JoinId);
	
}
