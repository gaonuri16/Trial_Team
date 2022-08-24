package com.spring.pr.insapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.InsappVO;
import com.spring.pr.command.TotalApplierVO;
import com.spring.pr.insapp.mapper.IInsappMapper;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

@Service
public class InsappService implements IInsappService {

	@Autowired
	private IInsappMapper mapper;
	
	@Override
	public List<TotalApplierVO> getInsappList(SearchVO search) {
		return mapper.getInsappList(search);
	}

	@Override
	public int getInsappTotal(PageVO paging) {
		return mapper.getInsappTotal(paging);
	}

	@Override
	public TotalApplierVO getInsappContent(int ANum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInsapp(InsappVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInsapp(int AppNum) {
		// TODO Auto-generated method stub

	}

}
