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
		
		System.out.println("�ɼ��� �������ּ���(�޴��߰�/�޴�����)");
		String input = sc.next();
		
		if(input.equals("�޴��߰�")) {
			System.out.println("�߰��� �޴� �̸��� �Է��ϼ���");
			String newMenuName = sc.next();
			System.out.println("�߰��� �޴��� ������ �Է��ϼ���");
			int newMenuPrice = sc.nextInt();
			System.out.println("�߰��� �޴��� ī�װ��� �Է��ϼ���");
			String newMenuCategory = sc.next();
			System.out.println("�߰��� �޴��� Į�θ��� �Է��ϼ���");
			int newMenuCalorie = sc.nextInt();
			
			MenuItem newMenuItem = new MenuItem(newMenuName, newMenuPrice, newMenuCategory, newMenuCalorie);
			
			menu.addMenu(newMenuItem);
			
		} else if(input.equals("�޴�����")) {
			menu.allMenu();
			System.out.println("\n������ �޴� ��ȣ�� �Է��ϼ���");
			int deletedMenuIndex = sc.nextInt();
			
			menu.deleteMenu(deletedMenuIndex);
		} else {
			
		}
		
	}
	
	

}
