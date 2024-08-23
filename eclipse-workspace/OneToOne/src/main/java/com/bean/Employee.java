package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hibernate_emp")
public class Employee {

	private int eid;
	private String job,dname;
	EmployeePersonalInfo einfo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="EPID")
	public EmployeePersonalInfo getEinfo() {
		return einfo;
	}
	public void setEinfo(EmployeePersonalInfo einfo) {
		this.einfo = einfo;
	}
	
}
