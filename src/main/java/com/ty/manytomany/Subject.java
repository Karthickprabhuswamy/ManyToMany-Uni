package com.ty.manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subject {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int sid;
	private String sname;
	private int sdays;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSdays() {
		return sdays;
	}

	public void setSdays(int sdays) {
		this.sdays = sdays;
	}

}
