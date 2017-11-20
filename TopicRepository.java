package xyz.prazy.springbootStarter.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{                    //Topic & String are generic types

	
}
