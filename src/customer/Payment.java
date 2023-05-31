package customer;

public class Payment {
	private String[] types = new String[] {"신용카드", "삼성페이", "애플페이", "카카오페이", "네이버페이", "페이코"};
	
	public void allPayment() {
		for(int i = 0; i < types.length; i++) {
			System.out.println((i+1) + ". " + types[i]);
		}
	}
	
	public String onePayment(int index) {
		System.out.println("선택한 결제방법은 " + types[index - 1] + "입니다. \n");
		
		return types[index - 1];
	}
	
	
}
