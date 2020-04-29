package com.example.web.admin;

import java.util.List;

public interface AdminDao {

	public void insert(Admin admin);

	public List<Admin> selectAll();

	public Admin selectOne(String employNumber);

	public void update(Admin admin);

	public void delete(Admin admin);



}
