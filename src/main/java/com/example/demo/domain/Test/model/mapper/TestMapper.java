package com.example.demo.domain.Test.model.mapper;

import com.example.demo.domain.Test.model.dto.TestDto;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TestMapper {

//    @Select("select * from test")
    public List<TestDto> findAll();

//    @Update("update test set message = #{message} where no = #{no}")
    public int modifyTestMessage(TestDto testDto);

//    @Update("update test set del_flag = #{delFlag} where no = #{no}")
    public int deleteTest(int no);

//    @Insert("insert int test (message) value (#{message}) ")
    public int insertTest(TestDto testDto);
}
