package com.cts.teacher.domain;

import java.io.Serializable;

public class BaseDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3765519189428024425L;

	private long createTime;
	private long createUser;
	private long updateTime;
	private long updateUser;
	private int sysStatus;

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

}
