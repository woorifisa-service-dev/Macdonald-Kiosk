package common;

import java.util.Scanner;

public class ScannerBox {

	 private static Scanner instance = new Scanner(System.in);
	    
	private ScannerBox(){ }
	
	    public static Scanner getInstance() {
		return instance;
	    }
}
