package com.example.course.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_Id")
	private Long course_Id;
	private String courseName;
	private Long author_id;
	private Long mentor_id;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long course_Id, String courseName, Long author_id, Long mentor_id) {
		super();
		this.course_Id = course_Id;
		this.courseName = courseName;
		this.author_id = author_id;
		this.mentor_id = mentor_id;
	}

	public Long getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Long course_Id) {
		this.course_Id = course_Id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}

	public Long getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(Long mentor_id) {
		this.mentor_id = mentor_id;
	}

}
