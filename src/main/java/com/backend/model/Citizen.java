package com.backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Citizen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String citizennumber;
	
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idcitizen;
	
	private String citizenname;
	private String citizensex;
	
	public Citizen(){}

	public Long getIdcitizen() {
		return idcitizen;
	}

	public void setIdcitizen(Long idcitizen) {
		this.idcitizen = idcitizen;
	}

	public String getCitizennumber() {
		return citizennumber;
	}

	public void setCitizennumber(String citizennumber) {
		this.citizennumber = citizennumber;
	}

	public String getCitizenname() {
		return citizenname;
	}

	public void setCitizenname(String citizenname) {
		this.citizenname = citizenname;
	}

	public String getCitizensex() {
		return citizensex;
	}

	public void setCitizensex(String citizensex) {
		this.citizensex = citizensex;
	};
	

}
