package at.allianz.mergebot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusCheckProvider {
	@JsonProperty("VALIDATION_HEAD")
	String validationHead;
	@JsonProperty("VALIDATION_DETAIL")
	String validationDetail;
}
