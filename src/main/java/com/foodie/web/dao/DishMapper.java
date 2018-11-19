package com.foodie.web.dao;

import com.foodie.web.model.Dish;

import java.util.List;

public interface DishMapper {
    int deleteByPrimaryKey(String id);

    int insert(Dish record);

    int insertSelective(Dish record);

    Dish selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);

    List<Dish> getAll();

    List<Dish> search(String queryString);

    List<Dish> selectByRestaurantId(String id);
}