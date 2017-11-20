package xyz.prazy.springbootStarter.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{                    //Topic & String are generic types
	public List<Course> findByTopicId(String topicId);
	
}
