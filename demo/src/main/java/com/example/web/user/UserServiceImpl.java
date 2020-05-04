package com.example.web.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public void register(User user) {
		userDao.insert(user);
	}

	@Override
	public void findAll() {
		userDao.selectAll();
	}

	@Override
	public void findOne(String employNumber) {
		userDao.selectOne(employNumber);
	}

	@Override
	public void modify(User user) {
		userDao.update(user);
	}

	@Override
	public void remove(User user) {
		userDao.remove(user);
	}

}