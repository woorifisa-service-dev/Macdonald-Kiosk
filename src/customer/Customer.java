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
		System.out.println("1.매장\n2.포장\n번호를 선택해주세요");
		int type = 0;
		while (count < 3) {
			type = sc.nextInt();
			if (!(type==1 || type==2)) {
				count++;
				System.out.println("1.매장\n2.포장\n번호를 다시 입력해주세요.");
			} else {
				break;
			}

		}
		if (count == 3) {
			System.out.println("입력 가능 횟수를 초과하여 종료합니다.");
			sc.close();
			return;
		}

		TakeOutChecking takeOutChecking = new TakeOutChecking(type);

		// 메뉴를 보여준다
		menu.allMenu();

		// 메뉴를 선택한다.
		System.out.println("메뉴 번호를 선택해주세요");
		MenuItem selectedMenu = menu.oneMenu(sc.nextInt());

		// 결제방법를 선택한다.
		Payment payment = new Payment();
		payment.allPayment();

		System.out.println("결제방법을 선택해주세요");
		String selectedPayment = payment.onePayment(sc.nextInt());


		// 매장인 경우
		ReceiveService receiveService = new ReceiveService();
		if (takeOutChecking.getType()==1) {
			System.out.println("1.테이블서비스\n2.픽업\n수령방법 번호를 선택해주세요.");
			type = sc.nextInt();

			receiveService.setType(type);
			
		}

		// 내역 출력
		MenuReceipt menuReceipt = new MenuReceipt(takeOutChecking.oneTakeChecking(), selectedMenu.getName(), selectedMenu.getPrice(), selectedPayment, receiveService.oneReceiveService());
		menuReceipt.printReceipt();
//		sc.close();
	}
	
}
