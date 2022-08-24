package com.spring.pr.trial.notice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.pr.app.mapper.IAppMapper;
import com.spring.pr.command.GhVO;
import com.spring.pr.command.InsttVO;
import com.spring.pr.command.TsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AppMapperTest {
	
	@Autowired IAppMapper mapper;
	/*
	@Test
	public void getListTest() {
		System.out.println(mapper.getAppList());
	}
	
	@Test
	public void getTotal() {
		System.out.println(mapper.getAppTotal());
	}
	
	@Test 
	public void getGhAppContentTest() {
		System.out.println(mapper.getGhAppContent(3));
	}
	
	@Test 
	public void getTsAppContentTest() {
		System.out.println(mapper.getTsAppContent(3));
	}	
	
	@Test 
	public void getInsttAppContentTest() {
		System.out.println(mapper.getInsttAppContent(3));
	}	
	*/
	@Test
	public void updateInsttTest() {
		InsttVO instt = new InsttVO();
		instt.setInsttNum(1);
		instt.setInsttName("수정1");
		instt.setInsttSocNum("수정");
		instt.setInsttHomeNum("수정");
		instt.setInsttPhoneNum("수정");
		instt.setInsttEmail("수정");
		instt.setInsttJob("수정");
		instt.setInsttFax("수정");
		instt.setInsttBank("수정");
		instt.setInsttSrttn("수정");
		instt.setInsttDtlSrttn("수정");
		instt.setInsttYear("수정");
		instt.setInsttBsnsNum("수정");
		instt.setInsttOfcName("수정");
		instt.setInsttAcadBack("수정");
		instt.setInsttAcadBakFile("수정");
		instt.setInsttCarrer("수정");
		instt.setInsttCarrerBack("수정");
		instt.setInsttAddr("수정");
		instt.setInsttDtlAddr("수정");
		mapper.updateInsttApp(instt);
	}
	
	@Test
	public void updateTsTest() {
		TsVO ts = new TsVO();
		ts.setTsNum(1);
		ts.setTsName("수정1");
		ts.setTsSocNum("수정");
		ts.setTsHomeNum("수정");
		ts.setTsPhoneNum("수정");
		ts.setTsEmail("수정");
		ts.setTsBank("수정");
		ts.setTsExprt("수정");
		ts.setTsLngg("수정");
		ts.setTsDsgCrt("수정");
		ts.setTsActiveArea("수정");
		ts.setTsAcadBack("수정");
		ts.setTsAcadBackFile("수정");
		ts.setTsCarrer("수정");
		ts.setTsCarrerFile("수정");
		ts.setTsAddr("수정");
		ts.setTsDtlAddr("수정");
		mapper.updateTsApp(ts);
	}
	
	@Test
	public void updateGhTest() {
		GhVO gh = new GhVO();
		gh.setGhNum(1);
		gh.setGhName("수정1");
		gh.setGhSocNum("수정");
		gh.setGhHomeNum("수정");
		gh.setGhPhoneNum("수정");
		gh.setGhEmail("수정");
		gh.setGhJob("수정");
		gh.setGhFax("수정");
		gh.setGhBank("수정");
		gh.setGhSrttn("수정");
		gh.setGhYear("수정");
		gh.setGhBsnsNum("수정");
		gh.setGhOfcNum("수정");
		gh.setGhOfcName("수정");
		gh.setGhAcadBack("수정");
		gh.setGhAcadBackFile("수정");
		gh.setGhCarrer("수정");
		gh.setGhCarrerFile("수정");
		gh.setGhAddr("수정");
		gh.setGhDtlAddr("수정");
		mapper.updateGhApp(gh);
	}
	
	@Test
	public void deleteTest() {
		mapper.deleteApp(7);
	}
	/*
	@Test
	public void deleteGhAppTest() {
		mapper.deleteGhApp(7);
	}
	
	@Test
	public void deleteTsAppTest() {
		mapper.deleteTsApp(7);
	}
	
	@Test
	public void deleteInsttAppTest() {
		mapper.deleteInsttApp(7);
	}*/
}