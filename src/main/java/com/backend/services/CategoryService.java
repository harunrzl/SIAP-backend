package com.backend.services;

import java.util.List;

import com.backend.model.Category;

public interface CategoryService {
	void addCategory (Category category);
	void deleteCategoryById(Long categoryid);
	List<Category> findAllCategory();
}
