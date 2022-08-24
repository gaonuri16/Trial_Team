package com.spring.pr.unq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.UnqualifyVO;
import com.spring.pr.unq.mapper.IUnqMapper;

@Service
public class UnqService implements IUnqService {

	@Autowired
	private IUnqMapper mapper;
	
	@Override
	public void UnqRegist(UnqualifyVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UnqualifyVO> getUnqList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUnqTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UnqualifyVO getUnqContent(String JoinId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUnq(UnqualifyVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUnq(String JoinId) {
		// TODO Auto-generated method stub

	}

}
