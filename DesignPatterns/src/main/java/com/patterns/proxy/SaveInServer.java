package com.patterns.proxy;

import java.util.ArrayList;

public class SaveInServer implements ISaveSubject {

	@Override
	public void save(ArrayList<String> dataToSave) {
		System.out.println("Saving data in Server...");
		for(String data : dataToSave) {
			System.out.println("Saving "+data+" in Server...OK");
		}
	}

}
