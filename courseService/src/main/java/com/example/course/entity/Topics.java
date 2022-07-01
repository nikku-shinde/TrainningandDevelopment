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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "topics")
public class Topics {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "topic_Id")
	private Long id;
	private String topicName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "course_Id", nullable = false)
	@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
	private Course course;

	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Topics(Long id, String topicName, Course course) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.course = course;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getTopicName() {
		return topicName;
	}


	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}


	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
