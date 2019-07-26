package com.patterns.proxy;

import java.util.ArrayList;

public class TestRun {

	public static void main(String[] args) {
		
		String data1 = "data1";
		String data2 = "data2";
		String data3 = "data3";
		
		ArrayList<String> data = new ArrayList<String>();
		data.add(data1);
		data.add(data2);
		data.add(data3);
		
		SaveDataProxy saveData = new SaveDataProxy();
		saveData.save(data);
		ConnectionManager.connect();
		saveData.save(data);
		ConnectionManager.disconnect();
		saveData.save(data);
		
	}

}
