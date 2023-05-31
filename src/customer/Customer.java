package customer;

import java.util.Scanner;

import common.Action;
import common.Menu;
import common.MenuItem;
import common.ScannerBox;

public class Customer implements Action {

	Scanner sc = ScannerBox.getInstance();
	
	@Override
	public void action(Menu menu) {
		
		int count = 0;
		System.out.println("1.����\n2.����\n��ȣ�� �������ּ���");
		int type = 0;
		while (count < 3) {
			type = sc.nextInt();
			if (!(type==1 || type==2)) {
				count++;
				System.out.println("1.����\n2.����\n��ȣ�� �ٽ� �Է����ּ���.");
			} else {
				break;
			}

		}
		if (count == 3) {
			System.out.println("�Է� ���� Ƚ���� �ʰ��Ͽ� �����մϴ�.");
			sc.close();
			return;
		}

		TakeOutChecking takeOutChecking = new TakeOutChecking(type);

		// �޴��� �����ش�
		menu.allMenu();

		// �޴��� �����Ѵ�.
		System.out.println("�޴� ��ȣ�� �������ּ���");
		MenuItem selectedMenu = menu.oneMenu(sc.nextInt());

		// ��������� �����Ѵ�.
		Payment payment = new Payment();
		payment.allPayment();

		System.out.println("��������� �������ּ���");
		String selectedPayment = payment.onePayment(sc.nextInt());


		// ������ ���
		ReceiveService receiveService = new ReceiveService();
		if (takeOutChecking.getType()==1) {
			System.out.println("1.���̺���\n2.�Ⱦ�\n���ɹ�� ��ȣ�� �������ּ���.");
			type = sc.nextInt();

			receiveService.setType(type);
			
		}

		// ���� ���
		MenuReceipt menuReceipt = new MenuReceipt(takeOutChecking.oneTakeChecking(), selectedMenu.getName(), selectedMenu.getPrice(), selectedPayment, receiveService.oneReceiveService());
		menuReceipt.printReceipt();
//		sc.close();
	}
	
}
