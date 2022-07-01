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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "sub_topics")
public class SubTopic {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subTopic_Id")
	private Long id;
	private String subTopicName;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "topic_Id", nullable = false)
	@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
	private Topics topic;

	public SubTopic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubTopic(Long id, String subTopicName, Topics topic) {
		super();
		this.id = id;
		this.subTopicName = subTopicName;
		this.topic = topic;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubTopicName() {
		return subTopicName;
	}

	public void setSubTopicName(String subTopicName) {
		this.subTopicName = subTopicName;
	}

	public Topics getTopic() {
		return topic;
	}

	public void setTopic(Topics topic) {
		this.topic = topic;
	}

}
