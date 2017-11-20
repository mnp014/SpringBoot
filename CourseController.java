package xyz.prazy.springbootStarter.Course;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xyz.prazy.springbootStarter.Topic.Topic;

@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;     // "@Aurowired" marks "TopicService" as "needs DI"
	
		
	/* GET REQUEST1*/
	@RequestMapping("/topics/{id}/courses")    // Map this method to any request that is a GET and has value "/topics"
	public List<Course> getAllTopics(@PathVariable String id) {
    		return courseService.getAllCourse(id);
	}
	
	
	/* GET REQUEST2*/
	@RequestMapping("/topics/{topicId}/courses/{id}")           //{} represents a variable
	public Course getCourse(@PathVariable String id){                       //@Pathvariable tells this argument value 'id' contains value of variable in the path "/topics/{id}"
		return courseService.getCourse(id);
	}
	
	
	/* POST REQUEST ADD course*/
	@RequestMapping(method=RequestMethod.POST, value= "/topics/{topicId}/courses")           // Map this method to any request that is a POST and has value "/topics"
		public void addCourse(@RequestBody Course course, @PathVariable String topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
			}

	
	/* PUT REQUEST   UPDATE course*/
	@RequestMapping(method=RequestMethod.PUT, value= "/topics/{topicId}/courses/{id}")           // Map this method to any request that is a POST and has value "/topics"
		public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
			}
	  
	/* POST REQUEST   DELETE  course*/
	@RequestMapping(method=RequestMethod.DELETE, value= "/topics/{topicId}/courses/{id}")           // Map this method to any request that is a POST and has value "/topics"
	public void deleteTopic(@PathVariable String id){                       //@Pathvariable tells this argument value 'id' contains value of variable in the path "/topics/{id}"
		courseService.deleteCourse(id);
			}
}