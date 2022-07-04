package at.allianz.mergebot;

public class FilesToMerge {
	
	private String fileName;
	private String pluginName;
	
	public FilesToMerge() {
	}
	
	public FilesToMerge(String fileName, String pluginName) {
		this.fileName = fileName;
		this.pluginName = pluginName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPluginName() {
		return pluginName;
	}
	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}
}
