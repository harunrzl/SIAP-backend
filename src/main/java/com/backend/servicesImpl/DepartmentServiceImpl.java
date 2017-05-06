package com.backend.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dao.DepartmentDao;
import com.backend.model.Department;
import com.backend.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentdao;
	
	@Override
	public void addDepartment(Department department) {
		departmentdao.save(department);
	}

	@Override
	public void deleteDepartmentById(Long departmentid) {
		departmentdao.delete(departmentid);

	}

	@Override
	public void deleteAllDepartment() {
		departmentdao.deleteAll();

	}

	@Override
	public List<Department> findAllDepartment() {
		// TODO Auto-generated method stub
		return departmentdao.findAll();
	}

	@Override
	public Department findDepartmentByName(String departmentname) {
		// TODO Auto-generated method stub
		//return departmentdao.findByDepartmentName(departmentname);
		return null;
	}

	@Override
	public void updateDepartment(Department department) {
		addDepartment(department);
	}
	
	public Department findDepartmentById (Long departmentid){
		return departmentdao.findOne(departmentid);
	}

}
