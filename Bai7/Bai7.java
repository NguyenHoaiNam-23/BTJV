package BTJV.Bai7;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		Scanner sc_123 =new Scanner(System.in);

		QLHS qlhs_123 = new QLHS();
		qlhs_123.nhapThongTin(sc_123);
		qlhs_123.hienThiThongTin();
		sc_123.close();
		
	}

}
