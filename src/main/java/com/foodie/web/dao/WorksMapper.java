package com.foodie.web.dao;

import com.foodie.web.model.Works;

import java.util.List;

public interface WorksMapper {
    int deleteByPrimaryKey(String id);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);

    List<Works> getAll();

    List<Works> selectByUserId(String userId);
}