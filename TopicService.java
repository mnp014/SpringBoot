package xyz.prazy.springbootStarter.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // Marks the class as Business Service
public class TopicService {
	
	private	List<Topic> topics =new ArrayList<>( Arrays.asList(                       // Mutable ArrayList
			new Topic("a", "spring", "Spring description"),
			new Topic("b", "java", "java description"),
			new Topic("c", "C++", "C++ description")));

	public List<Topic> getAllTopics(){
		return topics;
	}

	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
	
}
