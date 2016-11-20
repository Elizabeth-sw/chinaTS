package com.cts.teacher.domain;

public class TeacherDO extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7213973651784055076L;

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
