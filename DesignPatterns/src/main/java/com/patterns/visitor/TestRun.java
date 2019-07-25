package com.patterns.visitor;

import java.text.DecimalFormat;

public class TestRun {

	public static void main(String[] args) {
		ReducedProduct product1 = new ReducedProduct();
		product1.setPrice(130.58);
		NormalProduct product2 = new NormalProduct();
		product2.setPrice(130.58);
		IVA iva = new IVA();
		
		DecimalFormat format1 = new DecimalFormat(".##");
		
		System.out.println("Reduced Product price after taxes: "+format1.format(product1.accept(iva))+"$");
		System.out.println("Normal Product price after taxes: "+format1.format(product2.accept(iva))+"$");
	}

}
