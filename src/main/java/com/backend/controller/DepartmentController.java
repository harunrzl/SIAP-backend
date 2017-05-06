package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.Department;
import com.backend.services.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentservice;
	
	@RequestMapping(value="/new-department", method=RequestMethod.POST)
	public void addDepartment(@RequestBody Department department){
		departmentservice.addDepartment(department);
	}
	
	@RequestMapping(value="/department", method=RequestMethod.GET)
	public List <Department> findAllDepartment(){
		return departmentservice.findAllDepartment();
	};
	
	@RequestMapping(value="/department/{departmentid}", method=RequestMethod.DELETE)
	public void deleteDepartmentById (@PathVariable Long departmentid){
		departmentservice.deleteDepartmentById(departmentid);
	};
	
	@RequestMapping(value="/delete-all-department", method=RequestMethod.DELETE)
	public void deleteAllDepartment (){
		departmentservice.deleteAllDepartment();
	};
	
	/*@RequestMapping(value="/department/{departmentname}", method=RequestMethod.GET)
	public Department findDepartmentByName(@PathVariable String departmentname){
		return departmentservice.findDepartmentByName(departmentname);
		
	}*/
	
	@RequestMapping(value="/department/{departmentid}", method=RequestMethod.GET)
	public Department findDepartmentById (@PathVariable Long departmentid){
		return departmentservice.findDepartmentById(departmentid);
	}
	
	/*@RequestMapping(value="/department/{departmentid}", method=RequestMethod.GET)
	public void updateDepartment(@PathVariable Long departmentid, @RequestBody Department department){
		Department existingdepartment = departmentservice.findDepartmentById(departmentid);
		existingdepartment.setDepartmentname(existingdepartment.getDepartmentname());
		departmentservice.updateDepartment(existingdepartment);
	}*/
}
