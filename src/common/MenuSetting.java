package common;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuSetting {
	
	public ArrayList<MenuItem> menuSetting() {
		MenuItem item1 = new MenuItem("상하이버거", 4000, "햄버거", 300);
		MenuItem item2 = new MenuItem("1955버거", 4500, "햄버거", 350);
		MenuItem item3 = new MenuItem("슈비버거", 4300, "햄버거", 330);
		MenuItem item4 = new MenuItem("쿼터파운드치즈버거", 5000, "햄버거", 400);

		MenuItem[] menuArr = { item1, item2, item3, item4 };
		ArrayList<MenuItem> menuList = new ArrayList<>(Arrays.asList(menuArr));
		return menuList;
	}

}
