package com.example.demo.domain.Test.model.service;

import com.example.demo.domain.Test.model.dto.ModelResponseDto;

public interface TestService {
	
	public ModelResponseDto findAll();
	
	public ModelResponseDto findByNo(int no);
	
	public ModelResponseDto deleteModel(int no);
	
	

}
