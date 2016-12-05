package com.cts.test.teacher.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.cts.teacher.dao.ICtsUserTeacherDao;
import com.cts.teacher.domain.dto.CtsUserTeacherDO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
@Transactional
public class CtsUserTeacherDaoImplTest {

	@Autowired
	private ICtsUserTeacherDao ctsUserTeacherDao;

	@Test
	public void test() {
		CtsUserTeacherDO entity = new CtsUserTeacherDO();
		entity.setFirstName("will");
		entity.setLastName("sun");
		ctsUserTeacherDao.saveOrUpdate(entity);

		System.out.println(entity);
	}
}
