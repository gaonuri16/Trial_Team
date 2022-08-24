package com.spring.pr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.pr.suppapp.service.ISuppappService;

@Controller
@RequestMapping("/suppapp")
public class SuppappController {
	
	@Autowired
	private ISuppappService service;
	
	//보완 요청자 목록 요청 처리
	@GetMapping("/suppappList")
	public void SuppappList() {
		System.out.println("보완 요청자 목록 요청이 들어옴!");
	}
	
	//보완 요청자 통번역인 상세보기 요청 처리
	@GetMapping("/suppappDetailTotalTras")
	public void suppappDetailTotalTras() {
		System.out.println("보완 요청자 통번역인 상세보기 요청 들어옴!");
	}
	
	//보완 요청자 일반조력자 상세보기 요청 처리
	@GetMapping("/suppappDetailNormal")
	public void suppappDetailNormal() {
		System.out.println("보완 요청자 일반조력자 상세보기 요청 들어옴!");
	}
	
	//보완 요청자 기관추천조력자 상세보기 요청 처리
	@GetMapping("/suppappDetailInsRecom")
	public void suppappDetailInsRecom() {
		System.out.println("보완 요청자 기관추천조력자 상세보기 요청 들어옴!");
	}
	
	//보완 요청자 통번역인 수정 페이지 요청 처리
	@GetMapping("/suppappUpdateTotalTras")
	public void suppappUpdateTotalTras() {
		System.out.println("보완 요청자 통번역인 수정 요청 들어옴!");
	}
	
	//보완 요청자 일반조력자 수정 페이지 요청 처리
	@GetMapping("/suppappUpdateNormal")
	public void suppappUpdateNormal() {
		System.out.println("보완 요청자 일반조력자 수정 요청 들어옴!");
	}
	
	//보완 요청자 기관추천조력자 수정 페이지 요청 처리
	@GetMapping("/suppappUpdateInsRecom")
	public void AppUpdateRecom() {
		System.out.println("보완 요청자 기관추천조력자 수정 요청 들어옴!");
	}

}
