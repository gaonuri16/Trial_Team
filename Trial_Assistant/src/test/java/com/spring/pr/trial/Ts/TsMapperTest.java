package com.spring.pr.trial.Ts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.pr.command.GhVO;
import com.spring.pr.command.TsVO;
import com.spring.pr.ts.mapper.ITsMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class TsMapperTest {
	
	@Autowired
	private ITsMapper mapper;
	
	@Test
	public void registTest() {
		for (int i = 1; i <= 10; i++) {
			TsVO ts = new TsVO();
			ts.setTsName(i + "Name");
			ts.setTsSocNum(i + "SocNum");
			ts.setTsHomeNum(i + "HomeNum");
			ts.setTsJob("tsJob");
			ts.setTsAcadBack(i + "AcadBack");
			ts.setTsAcadBackFile(i + "c:// ~~~");
			ts.setTsAcadBackFileReal(i + "c:// ~~~");
			ts.setTsCarrer(i + "Carrer");
			ts.setTsCarrerFile(i + "c:// ~~~");
			ts.setTsCarrerFileReal(i + "c:// ~~~");
			ts.setTsEmail(i + "Email");
			ts.setTsPhoneNum(i + "PhoneNum");
			ts.setTsBank(i + "Bank");
			ts.setTsAccHol(i + "AccHol");
			ts.setTsBankNum(i + "BankNum");
			ts.setTsPostNum(i + "PostNum");
			ts.setTsAddr(i + "c:// ~~~");
			ts.setTsDtlAddr(i + "DtlAddr");
			ts.setTsExprt(i + "Exprt");
			ts.setTsLngg(i + "Lngg");
			ts.setTsDsgCrt(i + "DsgCrt");
			ts.setTsActiveArea(i + "ActiveArea");
			mapper.regist(ts);
		}
	}
	
	@Test
	public void getListTest() {
		System.out.println(mapper.getList());
	}
	
	@Test
	public void getTotal() {
		System.out.println(mapper.getTotal());
	}
	
	
	@Test
	public void getContentTest() {
		System.out.println(mapper.getContent(2));
	}
	
	@Test
	public void updateTest() {
			TsVO ts = new TsVO();
			ts.setTsName("수정");
			ts.setTsSocNum("수정");
			ts.setTsHomeNum("수정");
			ts.setTsJob("수정");
			ts.setTsAcadBack("수정");
			ts.setTsAcadBackFile("수정");
			ts.setTsAcadBackFileReal("수정");
			ts.setTsCarrer("수정");
			ts.setTsCarrerFile("수정");
			ts.setTsCarrerFileReal("수정");
			ts.setTsEmail("수정");
			ts.setTsPhoneNum("수정");
			ts.setTsBank("수정");
			ts.setTsAccHol("수정");
			ts.setTsBankNum("수정");
			ts.setTsPostNum("수정");
			ts.setTsAddr("수정");
			ts.setTsDtlAddr("수정");
			ts.setTsExprt("수정");
			ts.setTsLngg("수정");
			ts.setTsDsgCrt("수정");
			ts.setTsActiveArea("수정");
			ts.setTsNum(2);
			mapper.update(ts);
		}
	
	@Test
	public void deleteTest() {

		mapper.delete(3);
	}

}
