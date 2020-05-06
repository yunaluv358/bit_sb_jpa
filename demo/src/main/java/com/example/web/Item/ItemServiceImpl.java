package com.example.web.Item;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired ItemDao itemDao;
	@Override
	public List<Item> findAll() {
		return itemDao.selectAll();
	}

}