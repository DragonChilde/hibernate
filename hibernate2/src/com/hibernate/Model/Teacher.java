package com.hibernate.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="_teacher")

public class Teacher {
	private Integer age;
	private Date d;
	private int id;
	private String name;
	/*private TeacherPk pk;*/
	private String title;
	private Type type;
	
	@Transient
	public Integer getAge() {
		return age;
	}
	@Temporal(TemporalType.DATE)
	public Date getD() {
		return d;
	}
/*	@EmbeddedId 
	public TeacherPk getPk() {
		return pk;
	}*/
	public String getTitle() {
		return title;
	}
	
	@Id
	 @GeneratedValue
	public int getId() {
		return id;
	}
	@Column(name="_name")
	public String getName() {
		return name;
	}
	
	@Enumerated(EnumType.STRING )
	public Type getType() {
		return type;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
/*	public void setPk(TeacherPk pk) {
		this.pk = pk;
	}*/
	public void setTitle(String title) {
		this.title = title;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
