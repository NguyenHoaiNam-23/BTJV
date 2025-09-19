package BTJV.Bai7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QLHS {
	// thuoc tinh
	private HashMap<String, HocSinh> dsHocSinh_123;

	public QLHS() {
		dsHocSinh_123 = new HashMap<String, HocSinh>();
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap so luong hoc sinh: ");
		int soLuong_123 = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < soLuong_123; i++) {
			System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
			HocSinh hs_123 = new HocSinh();
			hs_123.nhapThongTin(sc);
			dsHocSinh_123.put(hs_123.getClass() + "", hs_123);
		}
	}

	public void hienThiThongTin() {
		System.out.println("Danh sach hoc sinh:");
		for (HocSinh hs_123 : dsHocSinh_123.values()) {
			hs_123.hienThiThongTin();
			System.out.println("--------------------");
		}
	}

	public void timKiemThongTin() {
		System.out.print("Nhap lop can tim: ");
		Scanner sc = new Scanner(System.in);
		String lop_123 = sc.nextLine();

		ArrayList<HocSinh> dsLop_123 = new ArrayList<HocSinh>();
		for (HocSinh hs_123 : dsHocSinh_123.values()) {
			if (hs_123.getLop().equalsIgnoreCase(lop_123)) {
				dsLop_123.add(hs_123);
			}
		}

		if (dsLop_123.isEmpty()) {
			System.out.println("Khong co hoc sinh nao trong lop " + lop_123);
		} else {
			System.out.println("Danh sach hoc sinh trong lop " + lop_123 + ":");
			for (HocSinh hs_123 : dsLop_123) {
				hs_123.hienThiThongTin();
				System.out.println("--------------------");
			}
		}
	}
}
