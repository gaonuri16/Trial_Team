package com.spring.pr.trial.notice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.pr.command.InsVO;
import com.spring.pr.ins.mapper.IInsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class InsMapperTest {
	
	@Autowired IInsMapper mapper;

	@Test
	public void registTest() {
		for(int i = 0; i <= 100; i++) {
			InsVO ins = new InsVO();
				ins.setInsNum(i);
				ins.setInsName(i + "번째 기관이름");
				ins.setInsPhone(i + "번째 기관전화번호");
				ins.setInsFaxNum(i + "번째 기관팩스번호");
				ins.setInsAddr(i + "번째 기관주소");
				ins.setInsAddrDetail(i + "번째 기관상세주소");
				ins.setJoinId(i + "번째 아이디");
				ins.setInsSocNum(i + "번째 사업자번호");
				mapper.registIns(ins);
		}
	}
	/*
	@Test
	public void getListTest() {
		System.out.println(mapper.getInsList());
	}
	
	@Test
	public void getTotal() {
		System.out.println(mapper.getInsTotal());
	}
	*/
	@Test 
	public void getContentTest() {
		System.out.println(mapper.getInsContent(4));
	}
	
	@Test
	public void updateTest() {
		InsVO ins = new InsVO();
			ins.setInsNum(4);
			ins.setInsName("수정된 기관이름");
			ins.setInsPhone("수정된 기관전화번호");
			ins.setInsFaxNum("수정된 기관팩스번호");
			ins.setInsAddr("수정된 기관주소");
			ins.setInsAddrDetail("수정된 기관상세주소");
			mapper.updateIns(ins);
	}
	
	@Test
	public void deleteTest() {
		mapper.deleteIns(8);
	}
}
