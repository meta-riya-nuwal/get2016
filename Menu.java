package menu;

import java.util.ArrayList;

public class Menu {

	void displayMenu(MenuItem mitem[]) {
		System.out.println("MenuItems Are:");

		for (int i = 0; i < mitem.length; i++) {

			if (mitem[i].getParentid().equals("null")) {

				System.out.println(mitem[i].getName());
				printSubItem(mitem[i].getId(), mitem);

			}
		}

	}

	void printSubItem(String id, MenuItem MItem[]) {
		for (int i = 0; i < MItem.length; i++) {
			if (MItem[i].getParentid().equals(id)) {

				String mn = returnMenuNameById(MItem[i].getParentid(), MItem);
				System.out.println(mn + " " + MItem[i].getName());
				printSubItem(MItem[i].getId(), MItem);
			}

		}
	}

	String returnMenuNameById(String id, MenuItem MItem[]) {

		for (int i = 0; i < MItem.length; i++) {
			if (MItem[i].getId().equals(id)) {

				return (MItem[i].getName());

			}

		}
		return null;
	}

}
