package com.yedam.sgroup.service;

public class Sgroup {

//	SGROUP_ID       NOT NULL NUMBER(5)    
//	SGROUP_NAME     NOT NULL VARCHAR2(15) 
//	SGROUP_HIREDATE          DATE         
//	SGROUP_EMAIL             VARCHAR2(15) 
//	SGROUP_AGE               NUMBER(2) 

	// 필드
	private String sgroupId;
	private String sgroupName;
	private String sgroupHiredate;
	private String sgroupEmail;
	private int sgroupAge;

	public String getSgroupId() {
		return sgroupId;
	}

	public void setSgroupId(String sgroupId) {
		this.sgroupId = sgroupId;
	}

	public String getSgroupName() {
		return sgroupName;
	}

	public void setSgroupName(String sgroupName) {
		this.sgroupName = sgroupName;
	}

	public String getSgroupHiredate() {
		return sgroupHiredate;
	}

	public void setSgroupHiredate(String sgroupHiredate) {
		this.sgroupHiredate = sgroupHiredate;
	}

	public String getSgroupEmail() {
		return sgroupEmail;
	}

	public void setSgroupEmail(String sgroupEmail) {
		this.sgroupEmail = sgroupEmail;
	}

	public int getSgroupAge() {
		return sgroupAge;
	}

	public void setSgroupAge(int sgroupAge) {
		this.sgroupAge = sgroupAge;
	}

	@Override
	public String toString() {
		return "Sgroup [sgroupId=" + sgroupId + ", sgroupName=" + sgroupName + ", sgroupHiredate=" + sgroupHiredate
				+ ", sgroupEmail=" + sgroupEmail + ", sgroupAge=" + sgroupAge + "]";
	}
 
}
