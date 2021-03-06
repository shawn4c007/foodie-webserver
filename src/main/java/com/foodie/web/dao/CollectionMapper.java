package com.foodie.web.dao;

import com.foodie.web.model.Collection;

import java.util.List;
import java.util.Map;

public interface CollectionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);

    Collection selectByDishAndUser(Map<String, Object> params);

    List<Collection> selectByUserId(String userId);
}