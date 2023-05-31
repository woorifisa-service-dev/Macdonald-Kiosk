import java.util.Scanner;

import admin.Admin;
import common.Menu;
import common.MenuSetting;
import common.ScannerBox;
import customer.Customer;

public class MacdonaldApplication {
	
	public static void main(String[] args) {
		Scanner sc = ScannerBox.getInstance();

		// �޴� �ʱ�ȭ
		MenuSetting setting = new MenuSetting();
		Menu menu = new Menu(setting.menuSetting());

		String position = "";

		while (true) {
			System.out.println("�������ΰ���?�մ��ΰ���?");
			position = sc.next();
			if (position.equals("������")) {
				Admin admin = new Admin();
				admin.action(menu);
			} else if (position.equals("�մ�")) {
				Customer customer = new Customer();
				customer.action(menu);
			} else {
				System.out.println("������ �Ǵ� �մ����� �ٽ� �Է��ϼ���");
				continue;
			}

			System.out.println("�����Ͻðڽ��ϱ�? y/n");
			String exit = sc.next().toLowerCase();

			if (exit.equals("y")) {
				break;
			}
		}
		

	}

}
