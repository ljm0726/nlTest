//package com.example.demo.domain.Test.model.dao;
//
//import com.example.demo.domain.Test.model.dto.TestDto;
//import com.example.demo.domain.Test.model.mapper.TestMapper;
//import java.util.List;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//@Repository // Database Access 처리
//@RequiredArgsConstructor
//public class TestDaoImpl implements TestDao{
//
//    private final TestMapper testMapper;
//
//    @Override
//    public List<TestDto> findAll() throws Exception {
//        return testMapper.findAll();
//    }
//
//    @Override
//    public TestDto findByNo(int no) {
//        return null;
//    }
//
//    @Override
//    public int deleteModel(int no) {
//        return 0;
//    }
//}
