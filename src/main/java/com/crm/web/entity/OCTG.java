package com.crm.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "OCTG")
public class OCTG implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PymntGroup")
	private int PymntGroup;

	@Column(name = "GroupCode")
	private int GroupCode;

	public OCTG() {

	}

	public OCTG(int pymntGroup, int groupCode) {

		PymntGroup = pymntGroup;
		GroupCode = groupCode;
	}

	public int getPymntGroup() {
		return PymntGroup;
	}

	public void setPymntGroup(int pymntGroup) {
		PymntGroup = pymntGroup;
	}

	public int getGroupCode() {
		return GroupCode;
	}

	public void setGroupCode(int groupCode) {
		GroupCode = groupCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
