package com.cts.teacher.enumtype;

public enum SysStatusEnum {

	NORMAL("正常", 0), DELETED("已删除", 1);

	private String name;
	private int value;

	private SysStatusEnum(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
