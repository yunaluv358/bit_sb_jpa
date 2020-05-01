package com.example.web.user;

public interface UserDao {

	public void insert(User user);

	public void selectAll();

	public void selectOne(String employNumber);

	public void update(User user);

	public void remove(User user);

}