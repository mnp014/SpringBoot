package xyz.prazy.springbootStarter.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import xyz.prazy.springbootStarter.Topic.Topic;

@Entity               // tells this class contains entities for the DB
public class Course {
	
	@Id              // makes the following line as Primary Key of the DB
	private String id;
	private String name;
	private String description;
	@ManyToOne                   //Maps many courses to one topic, where topic is foreign key to courses
	private Topic topic;
	
	public Course() {
		
	}
	
	  
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic=new Topic(topicId, "", ""); 
				
		
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}
