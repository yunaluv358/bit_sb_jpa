package com.example.web.admin.lost;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface LostService {

	public void register(Lost lost);

	public List<Lost> findAll();

	public Lost findOne(String lostID);

	public void modify(Lost lost);

	public void remove(Lost lost);
	

}