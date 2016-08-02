package menu;

import java.util.ArrayList;

public class MenuItem {
	MenuItem mitem[];
	String name;
	String id, parentid;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	MenuItem[] setItemtoMenu(ArrayList menu_item) {
		mitem = new MenuItem[menu_item.size()];

		for (int i = 0; i < menu_item.size(); i++) {
			mitem[i] = new MenuItem();
			String mnu = (String) menu_item.get(i);

			String[] menuArray = mnu.split(" ");
			mitem[i].setId(menuArray[0]);
			mitem[i].setName(menuArray[1]);
			mitem[i].setParentid(menuArray[2]);

		}
		return mitem;
	}
}
