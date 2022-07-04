package at.allianz.mergebot;

import java.util.List;

public class ScriptInputPost {
	private List<String> reviewerList;
	private String pullRequestUrl;
	
	public List<String> getReviewerList() {
		return reviewerList;
	}
	public void setReviewerList(List<String> reviewerList) {
		this.reviewerList = reviewerList;
	}
	public String getPullRequestUrl() {
		return pullRequestUrl;
	}
	public void setPullRequestUrl(String pullRequestUrl) {
		this.pullRequestUrl = pullRequestUrl;
	}
}
