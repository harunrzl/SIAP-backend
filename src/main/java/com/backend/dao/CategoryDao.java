package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {

}
