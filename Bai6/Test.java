package BTJV.Bai6;

import java.util.Scanner;

import BTJV.Bai6.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc_114 = new Scanner(System.in);

		KhachSan ks_114 = new KhachSan();
		ks_114.nhapThongTin(sc_114);
		ks_114.hienThiThongTin();
		ks_114.tinhTienThuePhong();
		sc_114.close();
	}

}
