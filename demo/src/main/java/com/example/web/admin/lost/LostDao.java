package com.example.web.admin.lost;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface LostDao {

	public void insert(Lost lost);

	public List<Lost> selectAll();

	public Lost selectOne(String lostID);

	public void update(Lost lost);

	public void delete(Lost lost);

}