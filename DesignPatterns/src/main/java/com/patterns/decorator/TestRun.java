package com.patterns.decorator;

public class TestRun {

	public static void main(String[] args) {
	
		Computer pcDummy = new DummyComputer();
		
		System.out.println(pcDummy.getDescription());
		System.out.println("Price: "+pcDummy.getPrice());
		
		Computer pcAdapted = new BaseComputer();
		pcAdapted = new FastSSD(pcAdapted);
		pcAdapted = new BigProcessor(pcAdapted);
		
		System.out.println(pcAdapted.getDescription());
		System.out.println("Price: "+pcAdapted.getPrice());
		
	}

}
