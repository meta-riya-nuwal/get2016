package Menus;

import java.util.List;
import java.util.ArrayList;

public class Menu {

	List<String> menu = new ArrayList<String>();

	List<String> addMenu() {
		menu.add("File");
		menu.add("Edit");
		menu.add("Format");
		menu.add("View");
		menu.add("Help");
		return menu;
	}

	void display() {
		for (int i = 0; i < menu.size(); i++) {
			System.out.println("Select " + i + " for " + menu.get(i));
		}
	}

	List<String> getmenues() {
		return menu;
	}

}
