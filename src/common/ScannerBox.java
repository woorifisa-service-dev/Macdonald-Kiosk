package common;

import java.util.Scanner;

public class ScannerBox {

	 private static Scanner instance = new Scanner(System.in);
	    
	    private ScannerBox() {
	        // �����ڴ� �ܺο��� ȣ����ϰ� private ���� �����ؾ� �Ѵ�.
	    }

	    public static Scanner getInstance() {
	        return instance;
	    }
}
