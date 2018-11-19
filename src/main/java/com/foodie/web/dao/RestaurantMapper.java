package com.foodie.web.dao;

import com.foodie.web.model.Restaurant;

import java.util.List;

public interface RestaurantMapper {
    int deleteByPrimaryKey(String id);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    Restaurant selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);

    Restaurant selectByAccountName(String accountName);

    List<Restaurant> getAll();
}