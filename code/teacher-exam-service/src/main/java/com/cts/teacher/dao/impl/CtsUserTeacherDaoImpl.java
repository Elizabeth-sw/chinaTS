package com.cts.teacher.dao.impl;

import org.springframework.stereotype.Repository;

import com.cts.common.dao.CtsDaoSupport;
import com.cts.teacher.dao.ICtsUserTeacherDao;
import com.cts.teacher.domain.dto.CtsUserTeacherDO;

@Repository
public class CtsUserTeacherDaoImpl extends CtsDaoSupport<CtsUserTeacherDO> implements ICtsUserTeacherDao {

	public CtsUserTeacherDaoImpl() {
		super(new CtsUserTeacherDO());
	}
	
	
}
