package com.patterns.flyweight;

import java.util.Random;

public class TestRun {

	public static void main(String[] args) {
		
		int numb_trees = 7;
		
		String[] types = {"pine", "fir", "willow"};
		
		TreesFactory factory = new TreesFactory();
		
		Random r = new Random();
		
		Random p = new Random();
		
		for(int i=0; i<numb_trees; i++) {
			ILightTree tree = factory.getTree(types[r.nextInt(types.length)]);
			tree.draw(p.nextInt(1000), p.nextInt(1000), p.nextInt(1000));
		}
		
	}

}
