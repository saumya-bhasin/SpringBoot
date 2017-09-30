package com.Saumya.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring desc"),
			new Topic("Java","Java Framework","Java desc"),
			new Topic("Python","Python Framework","Python desc")		
			
			));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return	topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
