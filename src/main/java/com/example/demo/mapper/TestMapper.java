package com.example.demo.mapper;

public interface TestMapper {
	
    int deleteByPrimaryKey(String userUid);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(String userUid);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
    
}