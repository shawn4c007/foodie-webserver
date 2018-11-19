package com.foodie.web.service.impl;

import com.foodie.web.dao.LikeMapper;
import com.foodie.web.model.Like;
import com.foodie.web.service.ILikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService implements ILikeService {

    @Autowired
    private LikeMapper likeMapper;

    @Override
    public int insert(Like like) {
        return likeMapper.insert(like);
    }
}
