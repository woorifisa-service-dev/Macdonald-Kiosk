package common;

import java.util.*;

public class Menu {
	private ArrayList<MenuItem> menuList;

	public Menu(ArrayList<MenuItem> menuList) {
		this.menuList = menuList;
	}
	
	// ��ü ��ȸ
	public void allMenu() {
		for(int i = 0; i < menuList.size(); i++) {
			System.out.println((i+1) +". " + menuList.get(i).toString());
		}
	}
	
	// ���� ��ȸ
	public MenuItem oneMenu(int index) {
		System.out.println("������ �޴��� " + menuList.get(index - 1).getName() + "�Դϴ�. \n");
		
		return menuList.get(index - 1);
	}
	
	
	//�߰�
	public void addMenu(MenuItem newMenuItem) {
		menuList.add(newMenuItem);
		System.out.println(newMenuItem.getName() + "�� �߰��Ǿ����ϴ�.\n");
		allMenu();
	}
	
	//����
	public void deleteMenu(int deleteMenuIndex) {
		String deleteMenuName = menuList.get(deleteMenuIndex - 1).getName();
		menuList.remove(deleteMenuIndex - 1);
		System.out.println(deleteMenuName + "�� �����Ǿ����ϴ�. \n");
		allMenu();
	}

}
