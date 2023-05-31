package common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MenuItem {
	private String name;
	private int price;
	private String category;
	private int calorie;
	
	@Override
	public String toString() {
		return "�޴��� : " + name + ", ���� : " + price + "��" + ", Į�θ� : " + calorie + "kcal";
	}
	
	
}
