package com.foodie.web.service;

import com.foodie.web.model.Restaurant;

import java.util.List;

public interface IRestaurantService {

//	Restaurant selectByAccountName(String accountName);
//
//	Restaurant selectByPhone(String phone);

    Restaurant selectByPrimaryKey(String id);

    Restaurant selectByAccountName(String accountName);

    List<Restaurant> getAll();

    int insert(Restaurant restaurant);
}
