package com.spring.pr.slctn.mapper;

import java.util.List;

import com.spring.pr.command.SlctnVO;

public interface ISlctnMapper {
	
	//조력자 신청 승인자 등록
	void SlctnRegist(SlctnVO vo);

	//조력자 신청 승인자 목록
	List<SlctnVO> getSlctnList();
	
	//총 조력자 신청 승인자 수
	int getSlctnTotal();
	
	//조력자 신청 승인자 상세보기
	SlctnVO getSlctnContent(int SelNum);
	
	//조력자 신청 승인자 수정
	void updateSlctn(SlctnVO vo);
	
	//조력자 신청 승인자 삭제
	void deleteSlctn(int SelNum);
}
