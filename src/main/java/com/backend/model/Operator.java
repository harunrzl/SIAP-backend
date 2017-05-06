package com.backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Operator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idoperator;

	private String operatorname;

	private String emailoperator;
	private String passoperator;
	private String phoneoprator;
	
	public Operator(){}

	public Long getIdoperator() {
		return idoperator;
	}

	public void setIdoperator(Long idoperator) {
		this.idoperator = idoperator;
	}

	

	public String getOperatorname() {
		return operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	

	public String getEmailoperator() {
		return emailoperator;
	}

	public void setEmailoperator(String emailoperator) {
		this.emailoperator = emailoperator;
	}

	public String getPassoperator() {
		return passoperator;
	}

	public void setPassoperator(String passoperator) {
		this.passoperator = passoperator;
	}

	public String getPhoneoprator() {
		return phoneoprator;
	}

	public void setPhoneoprator(String phoneoprator) {
		this.phoneoprator = phoneoprator;
	};
	
	
}
