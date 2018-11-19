package com.foodie.web.service;

import com.foodie.web.model.Collection;

import java.util.List;

public interface ICollectionService {
    int insert(Collection collection);

    Collection selectByPrimaryKey(String collectionId);

    Collection selectByDishAndUser(String dishId, String userId);

    int delete(Collection collection);

    List<Collection> selectByUserId(String userId);

}
