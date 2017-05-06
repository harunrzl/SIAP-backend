package com.backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Department implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long iddepartment;
	
	@NotNull
	private String departmentname;
	
	public Department(){};

	public Long getIddepartment() {
		return iddepartment;
	}

	public void setIddepartment(Long iddepartment) {
		this.iddepartment = iddepartment;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	
	

}
