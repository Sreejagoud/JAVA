package com.edu;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course
{
	@Id
	@Column(name="course_id")
	private int cid;
	@Column(name="course_name",length=40)
	private String cname;
	@Column(name="course_price")
	private float price;
	
	public Course(int cid, String cname, float price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}

	public Course() {
		super();
	}
	@ManyToMany(mappedBy = "courselist")
	Set<Student> studentlist;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Set<Student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(Set<Student> studentlist) {
		this.studentlist = studentlist;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + ", studentlist=" + studentlist + "]";
	}
	
	
}