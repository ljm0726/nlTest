package com.example.demo.domain.Test.model.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TestDto {
	
	private int no;
	
	private String message;
	
	private LocalDateTime regDate;

	private int delFlag;
	
}
