package menu;

import java.util.ArrayList;

public class ManageMenu {

	public static void main(String args[]) {
		Menu m = new Menu();
		MenuItem i = new MenuItem();
		ArrayList<String> menulist = new ArrayList<String>();
		menulist.add("1" + " " + "Home" + " " + "null");
		menulist.add("2" + " " + "contact" + " " + "null");
		menulist.add("3" + " " + "xyz" + " " + "null");
		menulist.add("4" + " " + "c1" + " " + "2");
		menulist.add("5" + " " + "c2" + " " + "4");
		menulist.add("6" + " " + "c3" + " " + "2");
		menulist.add("7" + " " + "c4" + " " + "5");
		MenuItem mitem[] = i.setItemtoMenu(menulist);

		m.displayMenu(mitem);
	}
}
