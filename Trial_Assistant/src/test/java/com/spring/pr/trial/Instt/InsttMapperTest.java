package com.spring.pr.trial.Instt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.pr.command.GhVO;
import com.spring.pr.command.InsttVO;
import com.spring.pr.instt.mapper.IInsttMapper;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class InsttMapperTest {
	
	@Autowired
	private IInsttMapper mapper;
	
	@Test
	public void registTest() {
		for (int i = 1; i <= 10; i++) {
			InsttVO instt = new InsttVO();
			instt.setInsttName(i + "Name");
			instt.setInsttOfcName(i + "OfcName");
			instt.setInsttYear(i + "Year");
			instt.setInsttSrttn(i + "Srttn");
			instt.setInsttDtlSrttn(i + "DtlSrttn");
			instt.setInsttSocNum(i + "SocNum");
			instt.setInsttBsnsNum(i + "BsnsNum");
			instt.setInsttJob(i + "Job");
			instt.setInsttFax(i + "Fax");
			instt.setInsttHomeNum(i + "HomeNum");
			instt.setInsttAcadBack(i + "AcadBack");
			instt.setInsttAcadBackFile(i + "c:// ~~~");
			instt.setInsttAcadBackFileReal(i + "c:// ~~~");
			instt.setInsttCarrer(i + "Carrer");
			instt.setInsttCarrerFile(i + "c:// ~~~");
			instt.setInsttCarrerFileReal(i + "c:// ~~~");
			instt.setInsttEmail(i + "Email");
			instt.setInsttPhoneNum(i + "PhoneNum");
			instt.setInsttBank(i + "Bank");
			instt.setInsttAccHol(i + "AccHol");
			instt.setInsttBankNum(i + "BankNum");
			instt.setInsttPostNum(i + "PostNum");
			instt.setInsttAddr("테헤란로7길");
			instt.setInsttDtlAddr("7층 4실습실");
			mapper.regist(instt);
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
		InsttVO instt = new InsttVO();
		instt.setInsttName("수정");
		instt.setInsttOfcName("수정");
		instt.setInsttYear("수정");
		instt.setInsttSrttn("수정");
		instt.setInsttDtlSrttn("수정");
		instt.setInsttSocNum("수정");
		instt.setInsttBsnsNum("수정");
		instt.setInsttJob("수정");
		instt.setInsttFax("수정");
		instt.setInsttHomeNum("수정");
		instt.setInsttAcadBack("수정");
		instt.setInsttAcadBackFile("수정");
		instt.setInsttAcadBackFileReal("수정");
		instt.setInsttCarrer("수정");
		instt.setInsttCarrerFile("수정");
		instt.setInsttCarrerFileReal("수정");
		instt.setInsttEmail("수정");
		instt.setInsttPhoneNum("수정");
		instt.setInsttBank("수정");
		instt.setInsttAccHol("수정");
		instt.setInsttBankNum("수정");
		instt.setInsttPostNum("수정");
		instt.setInsttAddr("수정");
		instt.setInsttDtlAddr("수정");
		instt.setInsttNum(2);
		mapper.update(instt);
	}
	
	@Test
	public void deleteTest() {
		mapper.delete(3);
	}

}
