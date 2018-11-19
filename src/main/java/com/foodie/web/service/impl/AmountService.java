package com.foodie.web.service.impl;

import com.foodie.web.dao.AmountMapper;
import com.foodie.web.model.Amount;
import com.foodie.web.service.IAmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmountService implements IAmountService {

    @Autowired
    private AmountMapper amountMapper;

    @Override
    public int insert(Amount amount) {
        return amountMapper.insert(amount);
    }

}
