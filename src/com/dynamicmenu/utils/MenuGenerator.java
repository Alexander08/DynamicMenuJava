package com.dynamicmenu.utils;

import java.util.ArrayList;

import com.dynamicmenu.model.Menu;
import com.dynamicmenu.model.MenuItem;

public class MenuGenerator {

	private static Menu menu = generateMenu();

	private static Menu generateMenu() {

		menu = new Menu();

		MenuItem item1 = new MenuItem(0, "Home", "", 0);
		MenuItem item2 = new MenuItem(1, "About", "about", 1);
		MenuItem item3 = new MenuItem(2, "Learn", "learn", 2, true, new ArrayList<>());
		MenuItem item31 = new MenuItem(3, "Java", "learn/java", 2);
		MenuItem item32 = new MenuItem(4, "Spring", "learn/spring", 2);
		MenuItem item33 = new MenuItem(5, "Something New", "learn/smth", 2);
		MenuItem item4 = new MenuItem(6, "Menu Item 4", "item4", 6);
		MenuItem item5 = new MenuItem(7, "Profile", "profile", 7);
		MenuItem item6 = new MenuItem(8, "Contact", "contact", 8);

		item3.getPageChildren().add(item31);
		item3.getPageChildren().add(item32);
		item3.getPageChildren().add(item33);

		menu.getMenuItems().add(item1);
		menu.getMenuItems().add(item2);
		menu.getMenuItems().add(item3);
		menu.getMenuItems().add(item4);
		menu.getMenuItems().add(item5);
		menu.getMenuItems().add(item6);

		return menu;
	}

	public static Menu getMenu() {
		return menu;
	}
}
