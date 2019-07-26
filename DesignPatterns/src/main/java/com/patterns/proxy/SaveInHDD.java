package com.patterns.proxy;

import java.util.ArrayList;

public class SaveInHDD implements ISaveSubject {

	@Override
	public void save(ArrayList<String> dataToSave) {
		System.out.println("Saving data in HDD...");
		for(String data : dataToSave) {
			System.out.println("Saving "+data+" in HDD...OK");
		}
	}

}
