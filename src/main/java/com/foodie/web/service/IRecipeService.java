package com.foodie.web.service;

import com.foodie.web.model.Recipe;
import com.foodie.web.model.Works;

import java.util.List;

public interface IRecipeService {
    Recipe selectByPrimaryKey(String id);

    int insert(Recipe recipe);

    List<Recipe> getHotRecipes(Integer count);

    List<Recipe> getNewRecipes(Integer count);

    List<Works> getAll();
}
