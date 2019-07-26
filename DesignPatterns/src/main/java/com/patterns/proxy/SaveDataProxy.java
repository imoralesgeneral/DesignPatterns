package com.patterns.proxy;

import java.util.ArrayList;

public class SaveDataProxy implements ISaveSubject {

	@Override
	public void save(ArrayList<String> dataToSave) {
		if(ConnectionManager.isConnected()) {
			new SaveInServer().save(dataToSave);
		} else {
			new SaveInHDD().save(dataToSave);
		}
	}

}
