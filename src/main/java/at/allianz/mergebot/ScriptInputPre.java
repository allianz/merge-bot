package at.allianz.mergebot;

import java.util.ArrayList;
import java.util.List;

public class ScriptInputPre{

	private List<FilesToMerge> filesToMerge = new ArrayList<>();
	private String user;
	private String userEmail;
	private List<String> commentsList;
	private String initialDeveloper;
	private List<String> reviewerList;
	private List<String> reviewSubmitterList;
	
	public List<FilesToMerge> getFilesToMerge() {
		return filesToMerge;
	}

	public void setFilesToMerge(List<FilesToMerge> filesToMerge) {
		this.filesToMerge = filesToMerge;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<String> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<String> commentsList) {
		this.commentsList = commentsList;
	}

	public String getInitialDeveloper() {
		return initialDeveloper;
	}

	public void setInitialDeveloper(String initialDeveloper) {
		this.initialDeveloper = initialDeveloper;
	}

	public List<String> getReviewerList() {
		return reviewerList;
	}

	public void setReviewerList(List<String> setReviewer) {
		this.reviewerList = setReviewer;
	}

	public List<String> getReviewSubmitterList() {
		return reviewSubmitterList;
	}

	public void setReviewSubmitterList(List<String> submittedReviews) {
		this.reviewSubmitterList = submittedReviews;
	}
}
