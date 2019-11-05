package moheb.javaTutorial.springBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	public List<Topic> topics = Arrays.asList(
				new Topic("java","JAVA Framework","Java desc"),
				new Topic("javascript","JavaScript Framework","JavaScript Framework desc"),
				new Topic("node","NodeJS Framework","NodeJS desc"),
				new Topic("css","CSS Framework","CSS desc")
				);
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}
}
