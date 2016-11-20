package com.cts.teacher.domain;

import java.io.Serializable;
import java.lang.reflect.Field;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BaseDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3765519189428024425L;

	protected long createTime;
	protected long createUser;
	protected long updateTime;
	protected long updateUser;
	protected int sysStatus;

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(long createUser) {
		this.createUser = createUser;
	}

	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}

	public long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(long updateUser) {
		this.updateUser = updateUser;
	}

	public int getSysStatus() {
		return sysStatus;
	}

	public void setSysStatus(int sysStatus) {
		this.sysStatus = sysStatus;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this); 
	}

}
