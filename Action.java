package Menus;

public class Action {

	void menuitemAction(String item) {

		switch (item) {
		case "New":
			System.out.print("Action will be new");
			break;
		case "Open":
			System.out.print("Action will be open");
			break;
		case "Save":
			System.out.print("Action will be save");
			break;
		case "Undo":
			System.out.print("Action will be undo");
			break;
		case "Cut":
			System.out.print("Action will be Cut");
			break;
		case "Copy":
			System.out.print("Action will be Copy");
			break;
		case "Font":
			System.out.print("Action will be Font");
			break;
		case "StatusBar":
			System.out.print("Action will be Statusbar");
			break;
		case "View Help":
			System.out.print("Action will be View help");
			break;
		case "About Notepad":
			System.out.print("Action will be About Notepad");
			break;
		}

	}
}
