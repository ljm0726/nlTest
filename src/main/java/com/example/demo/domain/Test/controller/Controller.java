package com.example.demo.domain.Test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/")
//@CrossOrigin("*") // News 데이터 가져올 때 혹시 체크
public class Controller {

	@GetMapping("/")
	public String test() {
		
		return "test";
	}
	
	
	@GetMapping("/test2")
	public String test2() {
		
		return "test2";
	}

}
