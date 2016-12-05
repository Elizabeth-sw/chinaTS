package com.cts.teacher.request;

import com.cts.sys.entity.BaseRequest;

public class QueryQuestionRequest extends BaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5549808141950471891L;
	/**
	 * 题目
	 */
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
