package com.example.demo.domain.Test.controller;

import com.example.demo.domain.Test.model.dto.ModelResponseDto;
import com.example.demo.domain.Test.model.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
//@CrossOrigin("*") //
public class Controller {

	private final TestService testService;

	@GetMapping("/test1")
	public String test() {
		return "test";
	}

	@PostMapping("/findAll")
	public ModelResponseDto findAll() {
		log.info("SDFDS");
		return testService.findAll();
	}

	@GetMapping("/test2")
	public String test2() {
		
		return "test2";
	}

}
