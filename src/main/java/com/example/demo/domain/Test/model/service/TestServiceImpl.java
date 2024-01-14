package com.example.demo.domain.Test.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Test.model.ModelResponseDto;
import com.example.demo.domain.Test.model.TestDto;

import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor -- eclipse Lombok은 final을 사용할 때 dependencies추가 만으로 안됨. 수동으로 Lombok을 설치해야함
// 기본적인 
public class TestServiceImpl implements TestService {

	@Autowired
	private ModelResponseDto modelResponseDto;
	
	@Override
	public ModelResponseDto findAll() {
		// TODO Auto-generated method stub
		return modelResponseDto;
	}

	@Override
	public ModelResponseDto findByNo(int no) {
		// TODO Auto-generated method stub
		return modelResponseDto;
	}

	@Override
	public ModelResponseDto deleteModel(int no) {
		// TODO Auto-generated method stub
		return modelResponseDto;
	}

}
