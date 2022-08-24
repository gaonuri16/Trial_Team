package com.spring.pr.trial.notice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.pr.command.UnqualifyVO;
import com.spring.pr.unq.mapper.IUnqMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UnqMapperTest {

	@Autowired IUnqMapper mapper;
	
	@Test
	public void registTest() {
		for(int i = 0; i <= 100; i++) {
			UnqualifyVO unq = new UnqualifyVO();
				unq.setJoinId(i + "번째 아이디");
				unq.setUnqReason(i + "번째 부적격 내용");
				mapper.UnqRegist(unq);
		}
	}
	
	@Test
	public void getListTest() {
		System.out.print(mapper.getUnqList());
	}
	
	@Test
	public void getTotal() {
		System.out.println(mapper.getUnqTotal());
	}
	
	@Test 
	public void getContentTest() {
		System.out.println(mapper.getUnqContent("2번째 아이디"));
	}
	
	@Test
	public void updateTest() {
		UnqualifyVO unq = new UnqualifyVO();
			unq.setJoinId("5번째 아이디");
			unq.setUnqReason("수정된 부적격 내용");
			mapper.updateUnq(unq);
	}
	
	@Test
	public void deleteTest() {
		mapper.deleteUnq("2번째 아이디");
	}
	
}
