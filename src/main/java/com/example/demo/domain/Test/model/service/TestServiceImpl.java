package com.example.demo.domain.Test.model.service;

//import com.example.demo.domain.Test.model.dao.TestDao;
import com.example.demo.domain.Test.model.dto.TestDto;
import com.example.demo.domain.Test.model.mapper.TestMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Test.model.dto.ModelResponseDto;

@Slf4j // log 확인
@Service
//@RequiredArgsConstructor
//-- eclipse Lombok은 final을 사용할 때 dependencies추가 만으로 안됨. 수동으로 Lombok을 설치해야함
// @Autowired로 생성자 주입..
public class TestServiceImpl implements TestService {

	private ModelResponseDto modelResponseDto;

//	private final TestDao testDao;
	private final TestMapper testMapper;

	@Autowired //Spring이 인식할 수 있도록 Bean 등록, 생성자 주입
	public TestServiceImpl(TestMapper testMapper) {
		this.testMapper = testMapper;
	}
	
	@Override
	public ModelResponseDto findAll() {
		// TODO Auto-generated method stub
		log.info("findAll");
		modelResponseDto = new ModelResponseDto();
		List<TestDto> testList = testMapper.findAll();
		if(testList != null) {
			modelResponseDto.setState(true);
			modelResponseDto.setTestDto(testList);
			modelResponseDto.setMessage("success");
		} else {
			modelResponseDto.setState(false);
		}

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
