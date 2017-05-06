package com.backend.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.CategoryDao;
import com.backend.model.Category;
import com.backend.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categorydao;
	
	@Override
	public void addCategory(Category category) {
		categorydao.save(category);
	}

	@Override
	public void deleteCategoryById(Long categoryid) {
		// TODO Auto-generated method stub
		categorydao.delete(categoryid);

	}
	
	public List<Category> findAllCategory(){
		return categorydao.findAll();
		
	}

}
