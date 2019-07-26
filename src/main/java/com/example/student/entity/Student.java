package com.example.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer age;
	private String loc;
	private long mob_no;
	private String edu;
	
	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getLoc()="
				+ getLoc() + ", getMob_no()=" + getMob_no() + ", getEdu()=" + getEdu() + "]";
	}

	public Student() {
		super();
	}

	public Student(Integer id, String name, Integer age, String loc, long mob_no, String edu) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.loc = loc;
		this.mob_no = mob_no;
		this.edu = edu;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public String getEdu() {
		return edu;
	}

	public void setEdu(String edu) {
		this.edu = edu;
	}
	
	
}
