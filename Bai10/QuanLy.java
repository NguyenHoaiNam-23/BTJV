package BTJV.Bai10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private HashMap<String, BienLai> danhSachBienLai;

	public QuanLy() {
		danhSachBienLai = new HashMap<String, BienLai>();
	}

	public void themBienLai(BienLai bl) {
		danhSachBienLai.put(bl.tenChuHo, bl); // su dung ten chu ho lam khoa
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap so luong bien lai can quan ly: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin bien lai thu " + (i + 1) + ":");
			BienLai bl = new BienLai();
			bl.nhapThongTin(sc);
			themBienLai(bl);
		}
	}

	public void hienThiDanhSachBienLai() {
		System.out.println("Danh sach bien lai:");
		for (BienLai bl : danhSachBienLai.values()) {
			bl.hienThiThongTin();
			System.out.println("-------------------------");
		}
	}
}
