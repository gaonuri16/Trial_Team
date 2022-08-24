package com.spring.pr.suppapp.mapper;

import java.util.List;

import com.spring.pr.command.GhVO;
import com.spring.pr.command.InsttVO;
import com.spring.pr.command.TotalApplierVO;
import com.spring.pr.command.TsVO;

public interface ISuppappMapper {

	//보완 요청자 목록
	List<TotalApplierVO> getSuppappList();
	
	//총 보완 요청자 수
	int getSuppappTotal();
	
	//보완 요청자 상세보기(일반조력자)
	GhVO getGhSuppappContent(int AppNum);
	
	//보완 요청자 상세보기(통번역인)
	TsVO getTsSuppappContent(int AppNum);
	
	//보완 요청자 상세보기(기관추천조력자)
	InsttVO getInsttSuppappContent(int AppNum);
	
	//보완 요청자 수정(일반조력자)
	void updateGhSuppapp(GhVO gvo);
	
	//보완 요청자 수정(통번역인)
	void updateTsSuppapp(TsVO tvo);
	
	//보완 요청자 수정(기관추천조력자)
	void updateInsttSuppapp(InsttVO ivo);
	
	//보완 요청자 삭제
	void deleteSuppapp(int AppNum);
	
	//보완 요청자 삭제(일반조력자)
	void deleteGhSuppapp(int GhNum);
	
	//보완 요청자 삭제(통번역인)
	void deleteTsSuppapp(int TsNum);
	
	//보완 요청자 삭제(기과추천조력자)
	void deleteInsttSuppapp(int InsttNum);
	
}
