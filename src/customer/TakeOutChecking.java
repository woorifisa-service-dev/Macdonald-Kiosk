package customer;

import lombok.Getter;


@Getter
public class TakeOutChecking {
	private int type;

	public TakeOutChecking(int type) {
		this.type = type;
	}
	
	public String oneTakeChecking() {
		if(type==1) {
			return "����";
		}else {
			return "����";
		}
	}
	
	
}
