package com.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.model.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {
	
	//Department findByDepartmentName(String departmentname);
}
