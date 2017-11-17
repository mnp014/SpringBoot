package xyz.prazy.springbootStarter.Topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	private static final String[] method = null;
	@Autowired
	private TopicService topicService;     // "@Aurowired" marks "TopicService" as "needs DI"
	
	
	
	
	/* GET REQUEST1*/
	@RequestMapping("/topics")    // Map this method to any request that is a GET and has value "/topics"
	public List<Topic> getAllTopics() {
    		return topicService.getAllTopics();
	}
	
	
	/* GET REQUEST2*/
	//@RequestMapping("/topics/a")             // Map this method to any request that is a GET and has value "/topics"
	@RequestMapping("/topics/{id}")           //{} represents a variable
	public Topic getTopic(@PathVariable String id){                       //@Pathvariable tells this argument value 'id' contains value of variable in the path "/topics/{id}"
		return topicService.getTopic(id);
	}
	
	
	/* POST REQUEST*/
	@RequestMapping(method=RequestMethod.POST, value= "/topics")           // Map this method to any request that is a POST and has value "/topics"
		public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
			}
	
	
	
	
}
