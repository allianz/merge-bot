package at.allianz.mergebot;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

public class ScriptInputToJson {
	
	private static Logger logger = LogManager.getLogger(ScriptInputToJson.class);
	
	public void createScriptInputAsJson(ScriptInputPre scriptInput, File preFile) {
		JsonFactory jsonFactory = new JsonFactory();
		jsonFactory.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true);
		jsonFactory.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
		ObjectMapper mapper = new ObjectMapper(jsonFactory);
		try {
			String jsonString = mapper.writeValueAsString(scriptInput);
			mapper.writeValue(preFile, scriptInput );
			logger.info("STRING from Pre-JSON {} {}",preFile.getName(), jsonString);
		} catch (IOException e) {
			logger.error("ERROR: Generating JSON for PreCommit", e);
		}
	}
	
	public void createScriptInputAsJson(ScriptInputPost scriptInput, File postFile) {
		JsonFactory jsonFactory = new JsonFactory();
		jsonFactory.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true);
		jsonFactory.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
		ObjectMapper mapper = new ObjectMapper(jsonFactory);
		try {
			String jsonString = mapper.writeValueAsString(scriptInput);
			mapper.writeValue(postFile, scriptInput );
			logger.info("STRING from Post-JSON {} {}",postFile.getName(), jsonString);
		} catch (IOException e) {
			logger.error("ERROR: Generating JSON for PostCommit", e);
		}
	}
}
