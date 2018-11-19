package com.foodie.web.service;

import com.foodie.web.model.Dish;

import java.util.List;


public interface IDishService {
    Dish selectByPrimaryKey(String id);

    int insert(Dish dish);

    List<Dish> getHotRecipes(Integer count);

    List<Dish> getNewRecipes(Integer count);

    List<Dish> getAll();

    List<Dish> search(String queryString);

    List<Dish> selectByRestaurantId(String id);

    int delete(Dish dish);
}
