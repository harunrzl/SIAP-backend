package com.backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PacketName implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idpacket;
	private String packetname;
	private String packetdesc;
	private String packetprize;
	private String packettime;
	
	public PacketName(){}

	public Integer getIdpacket() {
		return idpacket;
	}

	public void setIdpacket(Integer idpacket) {
		this.idpacket = idpacket;
	}

	public String getPacketname() {
		return packetname;
	}

	public void setPacketname(String packetname) {
		this.packetname = packetname;
	}

	public String getPacketdesc() {
		return packetdesc;
	}

	public void setPacketdesc(String packetdesc) {
		this.packetdesc = packetdesc;
	}

	public String getPacketprize() {
		return packetprize;
	}

	public void setPacketprize(String packetprize) {
		this.packetprize = packetprize;
	}

	public String getPackettime() {
		return packettime;
	}

	public void setPackettime(String packettime) {
		this.packettime = packettime;
	};
	
	

}
