package customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReceiveService {
	private int type;

	public String oneReceiveService() {
		if (type == 1) {
			return "���̺� ����";
		} else{
			return "�Ⱦ�";
		}
	}
}
