import java.util.Scanner;

import admin.Admin;
import common.Menu;
import common.MenuSetting;
import common.ScannerBox;
import customer.Customer;

public class MacdonaldApplication {
	
	public static void main(String[] args) {
		Scanner sc = ScannerBox.getInstance();

		// 메뉴 초기화
		MenuSetting setting = new MenuSetting();
		Menu menu = new Menu(setting.menuSetting());

		String position = "";

		while (true) {
			System.out.println("관리자인가요?손님인가요?");
			position = sc.next();
			if (position.equals("관리자")) {
				Admin admin = new Admin();
				admin.action(menu);
			} else if (position.equals("손님")) {
				Customer customer = new Customer();
				customer.action(menu);
			} else {
				System.out.println("관리자 또는 손님으로 다시 입력하세요");
				continue;
			}

			System.out.println("종료하시겠습니까? y/n");
			String exit = sc.next().toLowerCase();

			if (exit.equals("y")) {
				break;
			}
		}
		

	}

}
