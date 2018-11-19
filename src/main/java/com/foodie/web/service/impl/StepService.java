package com.foodie.web.service.impl;

import com.foodie.web.dao.StepMapper;
import com.foodie.web.model.Step;
import com.foodie.web.service.IStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService implements IStepService {
    @Autowired
    private StepMapper stepMapper;

    @Override
    public int Insert(Step step) {
        return stepMapper.insert(step);
    }
}
