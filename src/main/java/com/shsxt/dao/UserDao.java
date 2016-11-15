package com.shsxt.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.shsxt.po.User;

@Repository
public class UserDao {
	@Resource
	private SessionFactory factory;
	
	
	/**
	 * 根据id查询账户
	 * @param id
	 * @return
	 */
	public User querUseryById(Integer id){
		Session session=factory.openSession();
		User user=(User) session.get(User.class, id);
		session.close();
		return user;
		
	}
	
	
}
