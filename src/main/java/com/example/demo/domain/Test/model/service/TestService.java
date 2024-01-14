package com.example.demo.domain.Test.model.service;

import java.util.List;

import com.example.demo.domain.Test.model.ModelResponseDto;

public interface TestService {
	
	public ModelResponseDto findAll();
	
	public ModelResponseDto findByNo(int no);
	
	public ModelResponseDto deleteModel(int no);
	
	

}
