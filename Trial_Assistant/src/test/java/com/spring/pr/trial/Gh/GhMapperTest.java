package com.spring.pr.trial.Gh;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.spring.pr.command.GhVO;
import com.spring.pr.gh.mapper.IGhMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class GhMapperTest {
	
	@Autowired
	private IGhMapper mapper; 
	
	@Test
	public void registTest() {
		for (int i = 1; i <= 10; i++) {
			GhVO gh = new GhVO();
			gh.setGhName(i + "Name");
			gh.setGhOfcName(i + "OfcName");
			gh.setGhOfcNum(i + "OfcNum");
			gh.setGhYear(i + "Year");
			gh.setGhSrttn(i + "1");
			gh.setGhSocNum(i + "SocNum");
			gh.setGhBsnsNum(i + "BsnsNum");
			gh.setGhJob(i + "Job");
			gh.setGhFax(i + "Fax");
			gh.setGhHomeNum(i + "HomeNum");
			
			gh.setGhAcadBack(i + "AcadBack");
			gh.setGhAcadBackFile(i + "c:// ~~~");
			gh.setGhAcadBackFileReal(i + "c:// ~~~");
			
			gh.setGhCarrer(i + "Carrer");
			gh.setGhCarrerFile(i + "c:// ~~~");
			gh.setGhCarrerFileReal(i + "c:// ~~~");
			
			gh.setGhEmail(i + "Email");
			gh.setGhPhoneNum(i + "PhoneNum");
			gh.setGhBank(i + "Bank");
			gh.setGhAccHol(i + "AccHol");
			gh.setGhBankNum(i + "BankNum");
			gh.setGhPostNum(i + "PostNum");
			gh.setGhAddr(i + "Addr");
			gh.setGhDtlAddr(i + "DtlAddr");
			mapper.regist(gh);
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
		GhVO gh = new GhVO();
		gh.setGhName("수정");
		gh.setGhOfcName("수정");
		gh.setGhOfcNum("수정");
		gh.setGhYear("수정");
		gh.setGhSrttn("2");
		gh.setGhSocNum("수정");
		gh.setGhBsnsNum("수정");
		gh.setGhJob("수정");
		gh.setGhFax("수정");
		gh.setGhHomeNum("수정");
		gh.setGhAcadBack("수정");
		gh.setGhAcadBackFile("수정");
		gh.setGhAcadBackFileReal("수정");
		gh.setGhCarrer("수정");
		gh.setGhCarrerFile("수정");
		gh.setGhCarrerFileReal("수정");
		gh.setGhEmail("수정");
		gh.setGhPhoneNum("수정");
		gh.setGhBank("수정");
		gh.setGhAccHol("수정");
		gh.setGhBankNum("수정");
		gh.setGhPostNum("수정");
		gh.setGhAddr("수정");
		gh.setGhDtlAddr("수정");
		gh.setGhNum(27);
		mapper.update(gh);
	}
	
	@Test
	public void deleteTest() {
		mapper.delete(28);
	}
	
}



