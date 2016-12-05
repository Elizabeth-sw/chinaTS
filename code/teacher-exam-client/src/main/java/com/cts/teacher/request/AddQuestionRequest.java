package com.cts.teacher.request;

import com.cts.sys.entity.BaseRequest;

public class AddQuestionRequest extends BaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -896338300147090946L;
	/**
	 * 题目
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 分值
	 */
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

	@Override
	public String toString() {
		return "AddQuestionRequest [title=" + title + ", content=" + content + ", questionValue=" + questionValue + "]";
	}

}
