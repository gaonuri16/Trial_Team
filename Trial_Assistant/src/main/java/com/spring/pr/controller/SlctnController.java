package com.spring.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pr.slctn.service.ISlctnService;

@Controller
@RequestMapping("/slctn")
public class SlctnController {
	
	@Autowired
	private ISlctnService service;

	//선정 조력자 목록 요청 처리
	@GetMapping("/slctnList")
	public void SlctnList() {
		System.out.println("선정 조력자 목록 요청이 들어옴!");
	}
	
	//선정 조력자 상세보기 요청 처리
	@GetMapping("/slctnDetail")
	public void SlctnDetail() {
		System.out.println("선정 조력자 상세보기 요청이 들어옴!");
	}
	
	//선정 조력자 수정 페이지 요청 처리
	@GetMapping("/slctnUpdate")
	public void SlctnUpdate() {
		System.out.println("선정 조력자 수정 요청이 들어옴!");
	}
}
