package com.backend.services;

import java.util.List;

import com.backend.model.Department;

public interface DepartmentService {
		
	void addDepartment(Department department);
	Department findDepartmentById (Long departmentid);
	void deleteDepartmentById (Long departmentid);
	void deleteAllDepartment ();
	List <Department> findAllDepartment();
	Department findDepartmentByName(String departmentname);
	void updateDepartment(Department department);

}
