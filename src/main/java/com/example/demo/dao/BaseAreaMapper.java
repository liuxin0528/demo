package com.example.demo.dao;


import com.example.demo.entity.BaseArea;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseAreaMapper {

    int deleteByPrimaryKey(String areaCode);

    int insert(BaseArea record);

    int insertSelective(BaseArea record);

    BaseArea selectByPrimaryKey(String areaCode);

    int updateByPrimaryKeySelective(BaseArea record);

    int updateByPrimaryKey(BaseArea record);
}