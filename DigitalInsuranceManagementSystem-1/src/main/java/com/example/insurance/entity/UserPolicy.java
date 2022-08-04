package com.example.insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userpolicy")
public class UserPolicy {
	
	@Id
	@Column(name = "userid")
	 private Integer userid;
	
	@Column(name = "policyid")
	 private Integer policyid;

	public UserPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPolicy(Integer userid, Integer policyid) {
		super();
		this.userid = userid;
		this.policyid = policyid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getPolicyid() {
		return policyid;
	}

	public void setPolicyid(Integer policyid) {
		this.policyid = policyid;
	}
	
	

}
