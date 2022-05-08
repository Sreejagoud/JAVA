package com.edu;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student 
{
	@Id
	@Column(name="student_id")
	private int studid;
	@Column(name="student_name",length=30)
	private String studname;
	@Column(name="student_mobno",length=10)
	private String studmobno;
	public Student(int studid, String studname, String studmobno) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studmobno = studmobno;
	}
	public Student() {
		super();
	}
	@ManyToMany
	Set<Course> courselist;
	
	@JoinTable(
			name="hiberstudent_course",
			joinColumns = {
				@JoinColumn(name="stud_id",referencedColumnName="student_id")	
			},
			inverseJoinColumns = {
					@JoinColumn(name="course_id",referencedColumnName = "course_id")
			}
		)
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getStudmobno() {
		return studmobno;
	}
	public void setStudmobno(String studmobno) {
		this.studmobno = studmobno;
	}
	public Set<Course> getCourselist() {
		return courselist;
	}
	public void setCourselist(Set<Course> courselist) {
		this.courselist = courselist;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", studmobno=" + studmobno + ", courselist="
				+ courselist + "]";
	}
	
	

}