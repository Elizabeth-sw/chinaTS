package com.cts.teacher.domain;

public class ExamAnswer extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6979723305980058561L;

	private long questionId;
	private String title;
	private String content;
	private int coefficient;

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

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

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}

}
