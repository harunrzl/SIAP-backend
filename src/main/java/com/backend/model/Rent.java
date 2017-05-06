package com.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Rent implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idrent;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date registerdate;
	private Date updatedate;
	private Date expdate;
	private String rentstatus;
	
	public Rent(){}

	public Long getIdrent() {
		return idrent;
	}

	public void setIdrent(Long idrent) {
		this.idrent = idrent;
	}

	public Date getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public Date getExpdate() {
		return expdate;
	}

	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}

	public String getRentstatus() {
		return rentstatus;
	}

	public void setRentstatus(String rentstatus) {
		this.rentstatus = rentstatus;
	};
	
	

}
