package com.spring.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.pr.command.InsVO;
import com.spring.pr.ins.service.IInsService;
import com.spring.pr.util.PageCreator;
import com.spring.pr.util.PageVO;
import com.spring.pr.util.SearchVO;

@Controller
@RequestMapping("/ins")
public class InsController {
	
	@Autowired
	private IInsService service;
	
	//기관 정보 목록 조회 페이지 이동 요청 처리
	@GetMapping("/insList")
	public String InsList(Model model, SearchVO search, @RequestParam("page") int page) {
		System.out.println("요건 페이지 입니다" + page);
		System.out.println("기관 정보 목록 페이지 요청 들어옴!");
		//model.addAttribute("inslist", service.getInsList(paging));
		
		search.setPageNum(page);
		List<InsVO> list = service.getInsList(search);
		
		PageCreator pc = new PageCreator();
		pc.setPaging(search);
		pc.setArticleTotalCount(service.getInsTotal(search));
		model.addAttribute("inslist", list);
		model.addAttribute("pc", pc);
		
		return "/ins/insList";
	}
	
	//기관 정보 등록 페이지 요청 처리
	@GetMapping("/insAdd")
	public void InsAdd() {
		System.out.println("기관 정보 등록 페이지 요청 들어옴!");
	}
	
	//기관 정보 등록 요청 처리
	@PostMapping("/insAdd")
	public String InsAdd(InsVO vo) {
		service.registIns(vo);
		return "redirect:/ins/insList?page=1&cpp=10";
	}

	//기관 정보 상세보기 페이지 이동 요청 처리
	@GetMapping("/insDetail/{iNum}")
	public String InsDetail(@PathVariable int iNum, Model model) {
		System.out.println("기관 정보 상세보기 페이지 요청 들어옴!");
		model.addAttribute("insdetail", service.getInsContent(iNum));
		return "/ins/insDetail";
	}
	
	//기관 수정 페이지 이동 요청 처리
	@GetMapping("/insUpdate/{iNum}")
	public String InsUpdate(@PathVariable int iNum, InsVO vo, Model model) {
		System.out.println("기관 정보 수정 페이지 요청 들어옴!");
		model.addAttribute("insupdate", service.getInsContent(iNum));
		return "/ins/insUpdate";
	}
	
	//기관 수정 요청 처리
	@PostMapping("/insUpdate2")
	public String InsUpdate(InsVO vo) {
		System.out.println("화면에서 넘어온 수정 값:" + vo);
		System.out.println("기관 정보 수정 요청 들어옴!");
		service.updateIns(vo);
		return "redirect:/ins/insList?page=1&cpp=10";
	}

	//기관 정보 삭제 요청 처리
	@PostMapping("/insDelete/{iNum}")
	public String InsDelete(@PathVariable int iNum) {
		System.out.println("기관 정보 삭제 요청 들어옴!");
		service.deleteIns(iNum);
		return "redirect:/ins/insList?page=1&cpp=10";
	}
}
