package com.spring.pr.trial.Apply;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.pr.apply.mapper.IApplyMapper;
import com.spring.pr.command.AncmtVO;
import com.spring.pr.util.PageVO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ApplyMapperTest {
	
	@Autowired
	IApplyMapper mapper;
	
	/*
	 * @Test public void getListTest() { PageVO vo = new PageVO();
	 * System.out.println(mapper.getList(vo)); }
	 */
		
	@Test
	public void registTest() {
			for(int i=1; i<=20; i++) {
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			AncmtVO ancmt = new AncmtVO();
			ancmt.setAnmNum(1);
	        ancmt.setAnmTitle("1번째 제목입니다.");
	        ancmt.setAnmDegree("1차");
	        ancmt.setAnmStart(timestamp);
	        ancmt.setAnmEnd(timestamp);
	        ancmt.setAnmYear("2022년");
	        ancmt.setAnmDivision("기관추천조력자");
			mapper.regist(ancmt);
		}
	}
	
	//위에서 회원 가입한 아이디로 중복 확인을 해서
	//COUNT(*)를 이용해서 1이 리턴이 되는지 확인하세요.
	@Test
	public void checkIdTest() {
		int result = mapper.idCheck("kim1234");
		if(result == 1) {
			System.out.println("이미 신청하셨습니다.");
		} else {
			System.out.println("신청이 가능합니다.");
			}
		}

}
