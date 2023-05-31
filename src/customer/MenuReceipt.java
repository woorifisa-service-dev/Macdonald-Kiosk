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
		System.out.println("\n�ֹ������� Ȯ�����ּ���.\n"+
				"�Ļ���� : " + placeType + "\n" 
				+ "�޴� : " + menuName + "\n" 
				+ "���� : " + menuPrice + "\n"
				+ "������� : " + paymentType + "\n" 
				+ ((placeType.equals("����") ? "���ɹ�� : " + receiveType : "") + "\n"));
	}

}
