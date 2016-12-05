package com.cts.teacher.request;

import com.cts.sys.entity.BaseRequest;

public class QueryPaperRequest extends BaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6968601962265723762L;

	private Long teacherId;

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		return "QueryPaperRequest [teacherId=" + teacherId + "]";
	}

}
