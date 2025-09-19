package BTJV.Bai8;

import java.util.ArrayList;
import java.util.*;

public class QuanLy {
	// thuoc tinh
	private HashMap<String, CBGV> danhSachCBGV_123;

	public QuanLy() {
		danhSachCBGV_123 = new HashMap<String, CBGV>();
	}

	public void nhapDanhSachCBGV(Scanner sc) {
		System.out.print("Nhap so luong can bo giao vien: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin can bo giao vien thu " + (i + 1) + ":");
			CBGV cbgv = new CBGV();
			cbgv.nhapThongTin(sc);
			danhSachCBGV_123.put(cbgv.hoTen, cbgv); // su dung ho ten lam khoa
		}
	}

	public void hienThiDanhSachCBGV() {
		System.out.println("Danh sach can bo giao vien:");
		for (CBGV cbgv : danhSachCBGV_123.values()) {
			cbgv.hienThiThongTin();
			System.out.println("-------------------------");
		}
	}

	public void timKiemCBGV(Scanner sc) {
		System.out.print("Nhap ho ten can bo giao vien can tim: ");
		String hoTen = sc.nextLine();
		CBGV cbgv = danhSachCBGV_123.get(hoTen);
		if (cbgv != null) {
			System.out.println("Thong tin can bo giao vien:");
			cbgv.hienThiThongTin();
		} else {
			System.out.println("Khong tim thay can bo giao vien voi ho ten: " + hoTen);
		}
	}
}
