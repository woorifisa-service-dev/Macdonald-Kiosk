package common;

import java.util.Scanner;

public class ScannerBox {

	 private static Scanner instance = new Scanner(System.in);
	    
	    private ScannerBox() {
	        // 생성자는 외부에서 호출못하게 private 으로 지정해야 한다.
	    }

	    public static Scanner getInstance() {
	        return instance;
	    }
}
