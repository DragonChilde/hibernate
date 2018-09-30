package com.hibernate.Model;

import java.io.Serializable;

public class TeacherPk implements Serializable{
	private Integer id;
	private String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof TeacherPk) {
			TeacherPk pk = (TeacherPk)o;
			if(this.id == pk.getId() && this.name.equals(pk.getName())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}
