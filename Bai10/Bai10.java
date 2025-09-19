package BTJV.Bai10;

import java.util.Scanner;

import BTJV.Bai10.QuanLy;

public class Bai10 {

	public static void main(String[] args) {
		Scanner sc_114 = new Scanner(System.in);
		QuanLy ql_114 = new QuanLy();

		ql_114.nhapThongTin(sc_114);
		ql_114.hienThiDanhSachBienLai();
		sc_114.close();
	}
}
