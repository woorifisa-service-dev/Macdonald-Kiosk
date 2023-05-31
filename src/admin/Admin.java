package admin;

import java.util.Scanner;

import common.Action;
import common.Menu;
import common.MenuItem;
import common.ScannerBox;

public class Admin implements Action{
	
	Scanner sc = ScannerBox.getInstance();

	@Override
	public void action(Menu menu) {
		
		System.out.println("옵션을 선택해주세요(메뉴추가/메뉴삭제)");
		String input = sc.next();
		
		if(input.equals("메뉴추가")) {
			System.out.println("추가할 메뉴 이름을 입력하세요");
			String newMenuName = sc.next();
			System.out.println("추가할 메뉴의 가격을 입력하세요");
			int newMenuPrice = sc.nextInt();
			System.out.println("추가할 메뉴의 카테고리를 입력하세요");
			String newMenuCategory = sc.next();
			System.out.println("추가할 메뉴의 칼로리를 입력하세요");
			int newMenuCalorie = sc.nextInt();
			
			MenuItem newMenuItem = new MenuItem(newMenuName, newMenuPrice, newMenuCategory, newMenuCalorie);
			
			menu.addMenu(newMenuItem);
			
		} else if(input.equals("메뉴삭제")) {
			menu.allMenu();
			System.out.println("\n삭제할 메뉴 번호를 입력하세요");
			int deletedMenuIndex = sc.nextInt();
			
			menu.deleteMenu(deletedMenuIndex);
		} else {
			
		}
		
	}
	
	

}
