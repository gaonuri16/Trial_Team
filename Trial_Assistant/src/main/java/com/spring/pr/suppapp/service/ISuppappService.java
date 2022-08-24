package com.spring.pr.suppapp.service;

import java.util.List;

import com.spring.pr.command.GhVO;
import com.spring.pr.command.InsttVO;
import com.spring.pr.command.TotalApplierVO;
import com.spring.pr.command.TsVO;

public interface ISuppappService {

	//보완 요청자 목록
	List<TotalApplierVO> getAppList();
	
	//보완 요청자 상세보기(일반조력자)
	GhVO getGhAppContent(int AppNum);
	
	//보완 요청자 상세보기(통번역인)
	TsVO getTsAppContent(int AppNum);
	
	//보완 요청자 상세보기(기관추천조력자)
	InsttVO getInsttAppContent(int AppNum);
	
	//보완 요청자 수정(일반조력자)
	void updateGhApp(GhVO gvo);
	
	//보완 요청자 수정(통번역인)
	void updateTsApp(TsVO tvo);
	
	//보완 요청자 수정(기관추천조력자)
	void updateInsttApp(InsttVO ivo);
	
	//보완 요청자 삭제
	void deleteApp(int AppNum);
	
	//보완 요청자 삭제(일반조력자)
	void deleteGhApp(int GhNum);
	
	//보완 요청자 삭제(통번역인)
	void deleteTsApp(int TsNum);
	
	//보완 요청자 삭제(기과추천조력자)
	void deleteInsttApp(int InsttNum);
	
}
