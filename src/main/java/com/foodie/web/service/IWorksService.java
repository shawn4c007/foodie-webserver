package com.foodie.web.service;

import com.foodie.web.model.Works;

import java.util.List;

public interface IWorksService {
    Works selectByPrimaryKey(String id);

    int insert(Works works);

    List<Works> getAll();

    List<Works> selectByUserId(String userId);
}
