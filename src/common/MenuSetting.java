package common;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuSetting {
	
	public ArrayList<MenuItem> menuSetting() {
		MenuItem item1 = new MenuItem("�����̹���", 4000, "�ܹ���", 300);
		MenuItem item2 = new MenuItem("1955����", 4500, "�ܹ���", 350);
		MenuItem item3 = new MenuItem("�������", 4300, "�ܹ���", 330);
		MenuItem item4 = new MenuItem("�����Ŀ��ġ�����", 5000, "�ܹ���", 400);

		MenuItem[] menuArr = { item1, item2, item3, item4 };
		ArrayList<MenuItem> menuList = new ArrayList<>(Arrays.asList(menuArr));
		return menuList;
	}

}
