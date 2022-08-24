package com.spring.pr.suppapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.GhVO;
import com.spring.pr.command.InsttVO;
import com.spring.pr.command.TotalApplierVO;
import com.spring.pr.command.TsVO;
import com.spring.pr.suppapp.mapper.ISuppappMapper;

@Service
public class SuppappService implements ISuppappService {

	@Autowired
	private ISuppappMapper mapper;
	
	@Override
	public List<TotalApplierVO> getAppList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GhVO getGhAppContent(int AppNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TsVO getTsAppContent(int AppNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsttVO getInsttAppContent(int AppNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateGhApp(GhVO gvo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTsApp(TsVO tvo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateInsttApp(InsttVO ivo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteApp(int AppNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGhApp(int GhNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTsApp(int TsNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInsttApp(int InsttNum) {
		// TODO Auto-generated method stub

	}

}
