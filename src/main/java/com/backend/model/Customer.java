package com.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	private Long costumerid;
	private String costumername;
	private String governmentname;
	private String costumeraddress;
	private String costumeremail;
	@NotNull
	private String costumerphone;
	private String packetname;
	private String packetprize;
	
	@NotNull
	private String customer_username;
	@NotNull
	private String customer_password;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date registerdate;
	private Date updatedate;
	private Date expdate;
	
	public Customer (){};
	public Long getCostumerid() {
		return costumerid;
	}
	public void setCostumerid(Long costumerid) {
		this.costumerid = costumerid;
	}
	public String getCostumername() {
		return costumername;
	}
	public void setCostumername(String costumername) {
		this.costumername = costumername;
	}
	public String getGovernmentname() {
		return governmentname;
	}
	public void setGovernmentname(String governmentname) {
		this.governmentname = governmentname;
	}
	public String getCostumeraddress() {
		return costumeraddress;
	}
	public void setCostumeraddress(String costumeraddress) {
		this.costumeraddress = costumeraddress;
	}
	public String getCostumeremail() {
		return costumeremail;
	}
	public void setCostumeremail(String costumeremail) {
		this.costumeremail = costumeremail;
	}
	public String getCostumerphone() {
		return costumerphone;
	}
	public void setCostumerphone(String costumerphone) {
		this.costumerphone = costumerphone;
	}
	public String getPacketname() {
		return packetname;
	}
	public void setPacketname(String packetname) {
		this.packetname = packetname;
	}
	public String getPacketprize() {
		return packetprize;
	}
	public void setPacketprize(String packetprize) {
		this.packetprize = packetprize;
	}
	public String getCustomer_username() {
		return customer_username;
	}
	public void setCustomer_username(String customer_username) {
		this.customer_username = customer_username;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
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
	
}
