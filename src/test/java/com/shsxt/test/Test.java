package com.shsxt.test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shsxt.po.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class Test {
	@Autowired
	private HibernateTemplate template;
	
	
	@org.junit.Test
	public void test() {
		User user=template.get(User.class, 2);
		System.err.println(user);
	}

}
