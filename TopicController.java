package xyz.prazy.springbootStarter.Topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService;     // "@Aurowired" marks "TopicService" as "needs DI"
	
	
	
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
    		return topicService.getAllTopics();
	}
	
	//@RequestMapping("/topics/a")
	@RequestMapping("/topics/{id}")           //{} represents a variable
	public Topic getTopic(@PathVariable String id){                       //@Pathvariable tells this argument value 'id' contains value of variable in the path "/topics/{id}"
		return topicService.getTopic(id);
	}
	

	
/*Alternate method 	*/
	// if path variable and argument value are different (NOT RECOMMENDED) 
//	@RequestMapping("/topics/{foo}")           //{} represents a variable
//	public Topic getTopic2(@PathVariable ("foo") String id){                       //@Pathvariable tells this argument value 'id' contains value of variable in the path "/topics/{id}"
//		return topicService.getTopic(id);
//	}
	
	
	
	
}
