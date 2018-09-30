package com.hibernate.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Husband2 {
	private Integer age;
	private Integer id;
	private String name;
	private Wife wife;
	public Integer getAge() {
		return age;
	}
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@OneToOne
	public Wife getWife() {
		return wife;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
}
