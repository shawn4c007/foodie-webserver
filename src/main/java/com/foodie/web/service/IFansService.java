package com.foodie.web.service;

import com.foodie.web.model.Fans;

import java.util.List;

public interface IFansService {
    int insert(Fans fans);

    Fans selectByTwoId(String userId, String fansId);

    int delete(Fans fans);

    List<Fans> selectByUserId(String userId);

    List<Fans> selectByFansId(String fansId);
}
