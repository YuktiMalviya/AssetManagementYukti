package com.asset.managment.demo.Service;


import com.asset.managment.demo.Entity.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);
    Category updateCategory(Category category);
    List<Category> getAllCategory();
    Category getCategoryById(int id);
    void deleteCategory(int id);
}
