package xyz.prazy.springbootStarter.Topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
        
		// return is automatically converted into JSON by @RestController and retured as HTTP responce
		return Arrays.asList(
				new Topic("a", "spring", "Spring description"),
				new Topic("b", "java", "java description"),
				new Topic("c", "C++", "C++ description"));
				 
	}
}
