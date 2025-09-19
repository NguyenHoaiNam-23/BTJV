package BTJV.Bai6;

import java.util.Scanner;

import BTJV.Bai6.KhachSan;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sc_123 = new Scanner(System.in);

		KhachSan ks_123 = new KhachSan();
		ks_123.nhapThongTin(sc_123);
		ks_123.hienThiThongTin();
		ks_123.tinhTienThuePhong();
		sc_123.close();
	}

}
