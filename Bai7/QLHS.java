package BTJV.Bai7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QLHS {
	// thuoc tinh
	private HashMap<String, HocSinh> dsHocSinh_114;

	public QLHS() {
		dsHocSinh_114 = new HashMap<String, HocSinh>();
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap so luong hoc sinh: ");
		int soLuong_114 = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < soLuong_114; i++) {
			System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
			HocSinh hs_114 = new HocSinh();
			hs_114.nhapThongTin(sc);
			dsHocSinh_114.put(hs_114.getClass() + "", hs_114);
		}
	}

	public void hienThiThongTin() {
		System.out.println("Danh sach hoc sinh:");
		for (HocSinh hs_114 : dsHocSinh_114.values()) {
			hs_114.hienThiThongTin();
			System.out.println("--------------------");
		}
	}

	public void timKiemThongTin() {
		System.out.print("Nhap lop can tim: ");
		Scanner sc = new Scanner(System.in);
		String lop_114 = sc.nextLine();

		ArrayList<HocSinh> dsLop_114 = new ArrayList<HocSinh>();
		for (HocSinh hs_114 : dsHocSinh_114.values()) {
			if (hs_114.getLop().equalsIgnoreCase(lop_114)) {
				dsLop_114.add(hs_114);
			}
		}

		if (dsLop_114.isEmpty()) {
			System.out.println("Khong co hoc sinh nao trong lop " + lop_114);
		} else {
			System.out.println("Danh sach hoc sinh trong lop " + lop_114 + ":");
			for (HocSinh hs_114 : dsLop_114) {
				hs_114.hienThiThongTin();
				System.out.println("--------------------");
			}
		}
	}
}
