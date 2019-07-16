package com.patterns.composite;

public class TestRun {

	public static void main(String[] args) {
		MenuComponent dinnerMenu = new Menu("DINNER MENU", "Dinner");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Lunch");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Delicious Desserts");
		
		dinnerMenu.add(new MenuItem("Pasta", "Spaghetti bolognesa", false, 8.57));
		dinnerMenu.add(new MenuItem("Beef", "Barbacue Beef", false, 11.25));
		dinnerMenu.add(dessertMenu);
		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie with vanilla icecream", false, 2.69));
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All Menus combined");
		
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
		
	}

}
