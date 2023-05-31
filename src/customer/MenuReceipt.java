package customer;

public class MenuReceipt {
	private String placeType;
	private String menuName;
	private int menuPrice;
	private String paymentType;
	private String receiveType;

	public MenuReceipt(String placeType, String menuName, int menuPrice, String paymentType, String receiveType) {

		this.placeType = placeType;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.paymentType = paymentType;
		this.receiveType = receiveType;
	}

	public void printReceipt() {
		System.out.println("\n주문내역을 확인해주세요.\n"+
				"식사장소 : " + placeType + "\n" 
				+ "메뉴 : " + menuName + "\n" 
				+ "가격 : " + menuPrice + "\n"
				+ "결제방법 : " + paymentType + "\n" 
				+ ((placeType.equals("매장") ? "수령방법 : " + receiveType : "") + "\n"));
	}

}
