package com.example.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	UserDao userDao;
	
	@Override
	public void insert(User user) {
		userDao.insert(user);
		
	}

	@Override
	public void selectAll() {
		userDao.selectAll();
		
	}

	@Override
	public void selectOne(String employNumber) {
		userDao.selectOne(employNumber);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void remove(User user) {
		userDao.remove(user);
		
	}

}