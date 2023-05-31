package common;

import java.util.*;

public class Menu {
	private ArrayList<MenuItem> menuList;

	public Menu(ArrayList<MenuItem> menuList) {
		this.menuList = menuList;
	}
	
	// 전체 조회
	public void allMenu() {
		for(int i = 0; i < menuList.size(); i++) {
			System.out.println((i+1) +". " + menuList.get(i).toString());
		}
	}
	
	// 선택 조회
	public MenuItem oneMenu(int index) {
		System.out.println("선택한 메뉴는 " + menuList.get(index - 1).getName() + "입니다. \n");
		
		return menuList.get(index - 1);
	}
	
	
	//추가
	public void addMenu(MenuItem newMenuItem) {
		menuList.add(newMenuItem);
		System.out.println(newMenuItem.getName() + "이 추가되었습니다.\n");
		allMenu();
	}
	
	//삭제
	public void deleteMenu(int deleteMenuIndex) {
		String deleteMenuName = menuList.get(deleteMenuIndex - 1).getName();
		menuList.remove(deleteMenuIndex - 1);
		System.out.println(deleteMenuName + "이 삭제되었습니다. \n");
		allMenu();
	}

}
