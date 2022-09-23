package com.mysqlDtabase.mysqlDtabase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Students {
	
	@Id
	private Integer id;
	@Column
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + "]";
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
	

}
