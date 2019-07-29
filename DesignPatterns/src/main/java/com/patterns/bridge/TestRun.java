package com.patterns.bridge;

public class TestRun {

	public static void main(String[] args) {
		
		Mercedes mercedes = new Mercedes(new SportDrive(), 115);
		mercedes.driving();
		
		Fiat fiat = new Fiat(new ClassicDrive(), 115);
		fiat.driving();
		
	}

}
