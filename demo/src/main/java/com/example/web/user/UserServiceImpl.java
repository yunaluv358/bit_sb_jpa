package com.example.web.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired UserDao userDao;
	
	@Override
	public void signUp(User user) {
		userDao.insert(user);
	}

	@Override
	public List<User> fineAll() {
		return userDao.selectAll();
	}

	@Override
	public User findOne(String name) {
		return userDao.selectOne(name);
	}

	@Override
	public void modify(User user) {
		userDao.update(user);
	}

	@Override
	public void remove(User user) {
		userDao.delete(user);
	}

}
