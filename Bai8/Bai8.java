package BTJV.Bai8;

import java.util.Scanner;

import BTJV.Bai8.QuanLy;

public class Bai8 {

	public static void main(String[] args) {
		Scanner sc_114 = new Scanner(System.in);
		QuanLy ql_114 = new QuanLy();
		ql_114.nhapDanhSachCBGV(sc_114);
		ql_114.hienThiDanhSachCBGV();
		ql_114.timKiemCBGV(sc_114);
		sc_114.close();
	}

}
