package com.dynamicmenu.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<MenuItem> menuItems;

	public Menu() {
		
		super();
		
		this.menuItems = new ArrayList<MenuItem>();
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
}
