package at.allianz.mergebot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Receives the POST-request from the Webhook and delegates it to the
 * corresponding event class.
 */
public class Servlet extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = -4244592568945901972L;

	private static Logger logger = LogManager.getLogger(Servlet.class);
	static final EventFactory eventFactory = new EventFactory();

	@Override
	public void doPost(HttpServletRequest incoming, HttpServletResponse outgoing) {
		Event event = null;
		try {
			final String eventType = incoming.getHeader("X-GitHub-Event");
			event = eventFactory.getEvent(eventType);
			event.process(incoming, outgoing, eventType);
		} catch (NullPointerException e) {
			logger.info("This type of event is not registered in the Event Mapper");
			logger.error("ERROR: This type of event is not registered in the Event Mapper {}{}", event, e);
		}
	}
}