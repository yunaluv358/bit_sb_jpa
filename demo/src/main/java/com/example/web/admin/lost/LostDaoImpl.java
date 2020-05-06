package com.example.web.admin.lost;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.web.util.Data;
import com.example.web.util.Messenger;

@Component
public class LostDaoImpl implements LostDao{

	@Override
	public void insert(Lost lost) {
	}

	@Override
	public List<Lost> selectAll() {
		List<Lost> list = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(Data.DATA_PATH.toString()+Data.LOST_LIST+Data.CSV)));
			String string = "";
			while((string = bufferedReader.readLine())!=null) {
				stringList.add(string);
			}
			bufferedReader.close();
		} catch(Exception e) {
			System.out.println(Messenger.FILE_SELECT_ERROR);
		}
		Lost lost = null;
		for(int i = 0; i < stringList.size(); i++) {
			String[] strings = stringList.get(i).split(",");
			lost = new Lost();
			lost.setLostID(strings[0]);
			lost.setItemName(strings[1]);
			lost.setDate(strings[2]);
			lost.setArray(strings[3]);
			lost.setLocation(strings[4]);
			list.add(lost);
		}
		return list;
	}

	@Override
	public Lost selectOne(String lostID) {
		Lost lost = null;
		List<Lost> list = selectAll();
		for(Lost listLost : list) {
			if(lostID.equals(listLost.getLostID())) {
				lost = listLost;
				break;
			}
		}
		return lost;
	}

	@Override
	public void update(Lost lost) {
		
	}

	@Override
	public void delete(Lost lost) {
		
	}

}