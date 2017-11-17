package xyz.prazy.springbootStarter.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // Marks the class as Business Service
public class TopicService {
	
	private	List<Topic> topics = Arrays.asList(
			new Topic("a", "spring", "Spring description"),
			new Topic("b", "java", "java description"),
			new Topic("c", "C++", "C++ description"));

	public List<Topic> getAllTopics(){
		return topics;
	}

}