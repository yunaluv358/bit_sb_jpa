package com.example.web.admin.lost;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LostServiceImpl implements LostService{
	
	@Autowired LostDao lostDao;

	@Override
	public void register(Lost lost) {
		lostDao.insert(lost);
	}

	@Override
	public List<Lost> findAll() {
		return lostDao.selectAll();
	}

	@Override
	public Lost findOne(String lostID) {
		return lostDao.selectOne(lostID);
	}

	@Override
	public void modify(Lost lost) {
		lostDao.update(lost);
	}

	@Override
	public void remove(Lost lost) {
		lostDao.delete(lost);
	}
}