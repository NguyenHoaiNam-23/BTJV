package BTJV.Bai9;

import java.util.Scanner;

import BTJV.Bai9.QuanLy;

public class Bai9 {

	public static void main(String[] args) {
		Scanner sc_114 = new Scanner(System.in);
		QuanLy ql_114 = new QuanLy();
		ql_114.nhapDanhSach(sc_114);
		ql_114.hienThiDanhSachTraCuoiThang();
		ql_114.timKiemSV(sc_114);
		sc_114.close();
	}

}
