package xyz.prazy.springbootStarter.Topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
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
}
