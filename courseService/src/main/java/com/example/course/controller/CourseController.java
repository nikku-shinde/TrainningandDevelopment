package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entity.Course;
import com.example.course.entity.Questions;
import com.example.course.entity.SubTopic;
import com.example.course.entity.Topics;
import com.example.course.repository.CourseRepository;
import com.example.course.repository.QuestionRepository;
import com.example.course.repository.SubTopicRepository;
import com.example.course.repository.TopicRepository;
import com.example.course.service.CourseService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private TopicRepository topicRepo;
	
	@Autowired
	private SubTopicRepository subTopicRepo;
	
	@Autowired
	private QuestionRepository questionRepo;
	
	
	@PostMapping("/add-course")
	public ResponseEntity<?> addCourse(@RequestBody Course course) {
		List<Course> courseList = this.courseRepo.findAll();
		try {
			for(Course courseData : courseList) {
				System.out.println(courseData.getCourseName());
				if(courseData.getCourseName().equalsIgnoreCase(course.getCourseName())) {
					return ResponseEntity.ok(new Exception("Course already Added"));
				}else {
					return ResponseEntity.ok(this.courseService.addCourse(course));
				}
			}
			return ResponseEntity.ok(new String("Course already Added"));
		} catch (Exception e) {
			return ResponseEntity.ok(new Exception("Course already Added"));
		}
	}
	
	@PostMapping("/add-topics")
	public Topics addTopics(@RequestBody Topics topics) {
		return this.courseService.addTopics(topics);
	}
	
	@PostMapping("/add-sub_topics")
	public SubTopic addSubTopics(@RequestBody SubTopic subTopic) {
		return this.courseService.addSubTopics(subTopic);
	}
	
	@PostMapping("/add-questions")
	public Questions addQuestions(@RequestBody Questions questions) {
		return this.courseService.addQuestions(questions);
	}
	
	@GetMapping("/getCourseNames")
	public List<Course> getCourseNames() {
		return this.courseRepo.findAll();
	}
	
	@GetMapping("/getTopics")
	public List<Topics> getTopics() {
		return this.topicRepo.findAll();
	}
	
	@GetMapping("/getSubTopics")
	public List<SubTopic> getSubTopics() {
		return this.subTopicRepo.findAll();
	}
	
	@GetMapping("/getQuestions")
	public List<Questions> getQuestions() {
		return this.questionRepo.findAll();
	}
	
	@GetMapping("/getTopicsById/{course_id}")
	public List<Topics> getTopicByCourseId(@PathVariable("course_id") Long course_id) {
		return this.topicRepo.findTopicByCourseId(course_id);
	}
	
	@GetMapping("/getSubTopicsById/{topic_id}")
	public List<SubTopic> getSubTopicByTopicId(@PathVariable("topic_id") Long topic_id) {
		return this.subTopicRepo.findSubTopicByTopicId(topic_id);
	}
	
	@GetMapping("/getQuestionsById/{sub_topic_id}")
	public List<Questions> getQuestionsBySubTopicId(@PathVariable("sub_topic_id") Long sub_topic_id) {
		return this.questionRepo.findQuestionsBySubTopicId(sub_topic_id);
	}

}
