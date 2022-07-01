package com.example.course.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "question")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String question;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "subTopic_Id", nullable = false)
	@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
	private SubTopic subTopic;

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Questions(Long id, String question, SubTopic subTopic) {
		super();
		this.id = id;
		this.question = question;
		this.subTopic = subTopic;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public SubTopic getSubTopic() {
		return subTopic;
	}

	public void setSubTopic(SubTopic subTopic) {
		this.subTopic = subTopic;
	}

}
