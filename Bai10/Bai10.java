package BTJV.Bai10;

import java.util.Scanner;

import BTJV.Bai10.QuanLy;

public class Bai10 {

	public static void main(String[] args) {
		Scanner sc_123 = new Scanner(System.in);
		QuanLy ql_123 = new QuanLy();

		ql_123.nhapThongTin(sc_123);
		ql_123.hienThiDanhSachBienLai();
		sc_123.close();
	}
}
