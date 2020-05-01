package com.example.web.user;

import java.util.List;


public interface UserService {

	public void register(User user);

	public void findAll();

	public void findOne(String employNumber);

	public void modify(User user);

	public void remove(User user);




	
}