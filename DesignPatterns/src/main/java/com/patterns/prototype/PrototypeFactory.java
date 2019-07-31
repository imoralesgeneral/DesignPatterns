package com.patterns.prototype;

import java.util.HashMap;

public class PrototypeFactory {

	private HashMap mapObjects;
	private String defaultName;
	
	public PrototypeFactory() {
		super();
		this.mapObjects = new HashMap();
		// Including in the map all prototype products. In this case only one.
		mapObjects.put("Product 1", new ProductA(1));
	}
	
	public Object create() {
		return create(defaultName);
	}
	
	public Object create(String name) {
		defaultName = name;
		Product obj = (Product)mapObjects.get(name);
		if(obj != null) {
			return obj.clone();
		}
		return null;
	}
	
}
