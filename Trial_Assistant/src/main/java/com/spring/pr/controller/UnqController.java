package com.spring.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pr.unq.service.IUnqService;

@Controller
@RequestMapping("/unq")
public class UnqController {
	
	@Autowired
	private IUnqService service;
	
	//부적격자 목록 요청 처리
	@GetMapping("/unqList")
	public void UnqList() {
		System.out.println("부적격자 목록 요청이 들어옴!");
	}
	
	//부적격자 상세보기 요청 처리
	@GetMapping("/unqDetail")
	public void UnqDetail() {
		System.out.println("부적격자 상세보기 요청이 들어옴!");
	}
	
	//부적격자 수정 요청 처리
	@GetMapping("/unqUpdate")
	public void UnqUpdate() {
		System.out.println("부적격자 수정 요청이 들어옴");
	}

}
