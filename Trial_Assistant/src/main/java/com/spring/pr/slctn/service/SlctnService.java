package com.spring.pr.slctn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.SlctnVO;
import com.spring.pr.slctn.mapper.ISlctnMapper;

@Service
public class SlctnService implements ISlctnService {
	
	@Autowired
	private ISlctnMapper mapper;

	@Override
	public void SlctnRegist(SlctnVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SlctnVO> getSlctnList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSlctnTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SlctnVO getSlctnContent(int SelNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSlctn(SlctnVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSlctn(int SelNum) {
		// TODO Auto-generated method stub

	}

}
