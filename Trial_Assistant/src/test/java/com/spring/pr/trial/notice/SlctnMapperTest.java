package com.spring.pr.trial.notice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.pr.command.SlctnVO;
import com.spring.pr.slctn.mapper.ISlctnMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class SlctnMapperTest {
	
	@Autowired ISlctnMapper mapper;

	@Test
	public void registTest() {
		for(int i = 0; i <= 100; i++) {
			SlctnVO slctn = new SlctnVO();
				slctn.setSelNum(i);
				slctn.setJoinId(i + "번째 아이디");
				slctn.setSelName(i + "번째 이름");
				slctn.setSelSubcat(i + "번째 조력자 소분류");
				slctn.setSelScore(100);
				mapper.SlctnRegist(slctn);
		}
	}
	
	@Test
	public void getListTest() {
		System.out.println(mapper.getSlctnList());
	}
	
	@Test
	public void getTotal() {
		System.out.println(mapper.getSlctnTotal());
	}
	
	@Test 
	public void getContentTest() {
		System.out.println(mapper.getSlctnContent(2));
	}
	
	@Test
	public void updateTest() {
		SlctnVO slctn = new SlctnVO();
			slctn.setSelNum(2);
			slctn.setSelName("수정된 이름");
			slctn.setSelSubcat("수정된 조력자 소분류");
			slctn.setSelScore(64);
			mapper.updateSlctn(slctn);
	}
	
	@Test
	public void deleteTest() {
		mapper.deleteSlctn(6);
	}
}
