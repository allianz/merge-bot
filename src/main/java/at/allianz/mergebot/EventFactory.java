package at.allianz.mergebot;

import java.util.HashMap;
/**
 * Creates a new Event dependent on the type of the Webhook.
 */
public class EventFactory {
	
	private static HashMap <String, Event> eventMapper = new HashMap<>();
	
	/**
	 * Create a new Factory for handling the different events.
	 */
	public EventFactory() {
		eventMapper.put("pull_request", new IssuePullRequest());
		eventMapper.put("push", new IssuePush());
		eventMapper.put("pull_request_review", new IssuePullRequestReview());
		
	}
	
	/**
	 * Getter for the event type object.
	 * @param eventType event provided by Webhook as String.
	 * @return a new Object of the corresponding event class.
	 */
	public Event getEvent(String eventType) {
		return eventMapper.get(eventType);
		
	}
}
