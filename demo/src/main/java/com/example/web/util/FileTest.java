package com.example.web.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class FileTest {
	public final static String FILE_PATH = "C:\\Users\\bit\\spring-workspace\\myjinji\\src\\main\\resources\\static\\member\\";

	public static void main(String[] args) {
		try {
			File file = new File(FILE_PATH + "list.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> list = new ArrayList<>();
			while (true) {
				switch (JOptionPane.showInputDialog("0.종료 1.쓰기 2.읽기")) {
				case "0":
					return;
				case "1":
					String message = JOptionPane.showInputDialog("메세지 입력");
					writer.write(message);
					writer.newLine(); // 메세지 라인 바꾸기
					writer.flush(); // 전송!
					break;
				case "2":
					while ((message = reader.readLine()) != null) {
						list.add(message + ",");

					}
					JOptionPane.showMessageDialog(null, list);
					reader.close(); // 읽었으면 close로 끝내야함
					break;

				}
			}
		} catch (Exception e) {

		}
	}
}