package com.spring.pr.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.pr.command.InsttVO;
import com.spring.pr.instt.service.InsttService;
import com.spring.pr.util.ExcelRequestManager;

@RequestMapping("/apply")
@Controller
public class InsttController {

	@Autowired
	private InsttService service;

	//기관 신청 화면
	@GetMapping("insttRegist")
	public void insttRegist() {}
	
	@PostMapping("/insttRegistForm")
	public String createApplicant_action(
	        @ModelAttribute("insttVO") InsttVO instt,
	        RedirectAttributes redirectAttributes,
	        HttpServletRequest request,
	        MultipartHttpServletRequest multiRequest,
	        ModelMap model) {
		
		Map<String, Object> resMap = new HashMap<String, Object>();
		
		
		try {
			
		    ExcelRequestManager em = new ExcelRequestManager();
		    final Map<String, MultipartFile> files = multiRequest.getFileMap();
		    List<HashMap<String, String>> apply = null; 
		    
		    apply = em.parseExcelSpringMultiPart(files,"applicant", 0, "", "reserve");
		    
		    for(int i = 0; i < apply.size(); i++) {
		    	instt.setInsttName(apply.get(i).get("cell_0"));
		    	instt.setInsttSocNum(apply.get(i).get("cell_1"));
		    	instt.setInsttHomeNum(apply.get(i).get("cell_2"));
		    	instt.setInsttPhoneNum(apply.get(i).get("cell_3"));
		    	instt.setInsttJob(apply.get(i).get("cell_4"));
		    	instt.setInsttEmail(apply.get(i).get("cell_5"));
		    	instt.setInsttDtlSrttn(apply.get(i).get("cell_6"));
		    	instt.setInsttSrttn(apply.get(i).get("cell_7"));
		    	instt.setInsttBsnsNum(apply.get(i).get("cell_8"));
		    	instt.setInsttFax(apply.get(i).get("cell_9"));
		    	instt.setInsttOfcName(apply.get(i).get("cell_10"));
		    	instt.setInsttAcadBack(apply.get(i).get("cell_11"));
		    	instt.setInsttCarrer(apply.get(i).get("cell_12"));
		    	instt.setInsttBank(apply.get(i).get("cell_13"));
		    	instt.setInsttAccHol(apply.get(i).get("cell_14"));
		    	instt.setInsttBankNum(apply.get(i).get("cell_15"));
		    	instt.setInsttPostNum(apply.get(i).get("cell_16"));
		    	instt.setInsttAddr(apply.get(i).get("cell_17"));
		    	instt.setInsttDtlAddr(apply.get(i).get("cell_18"));
			    System.out.println(instt.toString());
			    service.regist(instt);

		    }
		    
		    
		    resMap.put("res", "ok");
		    resMap.put("msg", "txt.success");
		    System.out.println(resMap.toString());
		    
		}
		catch(Exception e){
			System.out.println(e.toString());
			resMap.put("res", "error"); 
			resMap.put("msg", "txt.fial"); 
		}
		
		redirectAttributes.addFlashAttribute("resMap", resMap);
		return "apply/insttRegist";
		
	}

}
