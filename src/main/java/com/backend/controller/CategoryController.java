package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Category;
import com.backend.services.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryservice;
	
		
	@RequestMapping(value="/create-category", method=RequestMethod.POST)
	public void addCategory(@RequestBody Category category){
		categoryservice.addCategory(category);
	}
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public List<Category> findAllCategory(){
		return categoryservice.findAllCategory();
	}
	
	@RequestMapping(value="/category/{categoryid}", method=RequestMethod.DELETE)
	public void deleteCategoryById(@PathVariable Long categoryid){
		categoryservice.deleteCategoryById(categoryid);
	}

}
