package BTJV.Bai9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private HashMap<String, SinhVien> danhSachSV_123;

	public QuanLy() {
		danhSachSV_123 = new HashMap<String, SinhVien>();
	}

	public void nhapDanhSach(Scanner sc) {
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
			SinhVien sv = new SinhVien();
			sv.nhapThongTin(sc);
			danhSachSV_123.put(sv.hoTen, sv); // su dung ho ten lam khoa
		}
	}

	public void hienThiDanhSachTraCuoiThang() {
		for (SinhVien sv : danhSachSV_123.values()) {
			sv.hienThiThongTin();
			System.out.println("-------------------------");
		}
	}

	public void timKiemSV(Scanner sc) {
		System.out.print("Nhap ho ten sinh vien can tim: ");
		String hoTen = sc.nextLine();
		SinhVien sv = danhSachSV_123.get(hoTen);
		if (sv != null) {
			System.out.println("Thong tin sinh vien:");
			sv.hienThiThongTin();
		} else {
			System.out.println("Khong tim thay sinh vien voi ho ten: " + hoTen);
		}
	}
}
