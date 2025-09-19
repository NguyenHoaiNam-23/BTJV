package BTJV.Bai8;

import java.util.Scanner;

import BTJV.Bai8.QuanLy;

public class Bai8 {

	public static void main(String[] args) {
		Scanner sc_123 = new Scanner(System.in);
		QuanLy ql_123 = new QuanLy();
		ql_123.nhapDanhSachCBGV(sc_123);
		ql_123.hienThiDanhSachCBGV();
		ql_123.timKiemCBGV(sc_123);
		sc_123.close();
	}

}
