package com.cts.teacher.domain;

public class ExamQuestionDO extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3284388639932372993L;

	private String title;
	private String content;
	private int questionValue;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getQuestionValue() {
		return questionValue;
	}

	public void setQuestionValue(int questionValue) {
		this.questionValue = questionValue;
	}

}
