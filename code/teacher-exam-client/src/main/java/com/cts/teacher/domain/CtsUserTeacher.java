package com.cts.teacher.domain;
// Generated 2016-11-29 1:16:02 by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cts.teacher.enumtype.SysStatusEnum;

/**
 * CtsUserTeacher generated by hbm2java
 */
@Entity
@Table(name = "cts_user_teacher")
public class CtsUserTeacher implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 866386156944490456L;
	private Long id;
	private Integer createTime;
	private Long createUser;
	private Long updateUser;
	private Integer updateTime;
	private SysStatusEnum sysStatus;
	private String firstName;
	private String lastName;

	public CtsUserTeacher() {
	}

	public CtsUserTeacher(Integer createTime, Long createUser, Long updateUser, Integer updateTime, SysStatusEnum sysStatus,
			String firstName, String lastName) {
		this.createTime = createTime;
		this.createUser = createUser;
		this.updateUser = updateUser;
		this.updateTime = updateTime;
		this.sysStatus = sysStatus;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "create_time")
	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	@Column(name = "create_user")
	public Long getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	@Column(name = "update_user")
	public Long getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	@Column(name = "update_time")
	public Integer getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "sys_status")
	@Enumerated(EnumType.ORDINAL)
	public SysStatusEnum getSysStatus() {
		return this.sysStatus;
	}

	public void setSysStatus(SysStatusEnum sysStatus) {
		this.sysStatus = sysStatus;
	}

	@Column(name = "first_name", length = 256)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 256)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}