package BTJV.Bai9;

import java.util.Scanner;

import BTJV.Bai9.QuanLy;

public class Bai9 {

	public static void main(String[] args) {
		Scanner sc_123 = new Scanner(System.in);
		QuanLy ql_123 = new QuanLy();
		ql_123.nhapDanhSach(sc_123);
		ql_123.hienThiDanhSachTraCuoiThang();
		ql_123.timKiemSV(sc_123);
		sc_123.close();
	}

}
