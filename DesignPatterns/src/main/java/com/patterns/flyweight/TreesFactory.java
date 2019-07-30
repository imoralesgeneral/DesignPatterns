package com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreesFactory {

	private Map trees;
	
	public TreesFactory() {
		this.trees = new HashMap();
	}
	
	public ILightTree getTree(String type) {
		if(!trees.containsKey(type)) {
			trees.put(type, new Tree(type));
		}
		return (ILightTree) trees.get(type);
	}
	
}
