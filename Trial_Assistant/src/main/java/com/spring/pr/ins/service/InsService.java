package com.spring.pr.ins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.InsVO;
import com.spring.pr.ins.mapper.IInsMapper;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

@Service
public class InsService implements IInsService {
	
	@Autowired
	private IInsMapper mapper;
/*
	@Override
	public List<InsVO> getInsList(PageVO paging) {
		return mapper.getInsList(paging);
	}
*/
	@Override
	public List<InsVO> getInsList(SearchVO search) {
		List<InsVO> list = mapper.getInsList(search);
		return list;
	}
	
	@Override
	public void registIns(InsVO vo) {
		mapper.registIns(vo);
	}

	@Override
	public int getInsTotal(PageVO paging) {
		return mapper.getInsTotal(paging);
	}

	@Override
	public InsVO getInsContent(int InsNum) {
		return mapper.getInsContent(InsNum);
	}

	@Override
	public void updateIns(InsVO vo) {
		mapper.updateIns(vo);
	}

	@Override
	public void deleteIns(int InsNum) {
		mapper.deleteIns(InsNum);
	}

}
