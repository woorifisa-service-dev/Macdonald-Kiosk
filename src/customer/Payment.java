package customer;

public class Payment {
	private String[] types = new String[] {"�ſ�ī��", "�Ｚ����", "��������", "īī������", "���̹�����", "������"};
	
	public void allPayment() {
		for(int i = 0; i < types.length; i++) {
			System.out.println((i+1) + ". " + types[i]);
		}
	}
	
	public String onePayment(int index) {
		System.out.println("������ ��������� " + types[index - 1] + "�Դϴ�. \n");
		
		return types[index - 1];
	}
	
	
}
