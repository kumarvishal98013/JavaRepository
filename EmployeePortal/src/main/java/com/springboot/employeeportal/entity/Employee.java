package com.springboot.employeeportal.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue
	int id;

	@JsonProperty("first_name")
	@Column(name = "first_name")
	String first_name;

	@JsonProperty("last_name")
	@Column(name = "last_name")
	String last_name;

	@JsonProperty("gender")
	@Column(name = "gender")
	String gender;

	@JsonProperty("date_of_birth")
	@Column(name = "date_of_birth")
	Date date_of_birth;

	@JsonProperty("department")
	@Column(name = "department")
	String department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
