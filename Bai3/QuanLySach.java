package BTJV.Bai3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuanLySach {
	private HashMap<String, TaiLieu> danhSachTL;

	public QuanLySach() {
		danhSachTL = new HashMap<>();
	}

	public void themTaiLieu(TaiLieu tl) {
		danhSachTL.put(tl.getMaTaiLieu(), tl);
	}

	public void hienThiTatCaTaiLieu() {
		for (TaiLieu tl : danhSachTL.values()) {
			tl.hienThiThongTin();
			System.out.println("-------------------------");
		}
	}

	public void nhapTaiLieu(Scanner sc) {
		System.out.println("Chon loai tai lieu can nhap:");
		System.out.println("1. Sach");
		System.out.println("2. Tap Chi");
		System.out.println("3. Bao");
		System.out.print("Lua chon cua ban: ");
		int choice = sc.nextInt();
		sc.nextLine(); // consume newline

		TaiLieu tl = null;
		switch (choice) {
			case 1:
				tl = new Sach();
				break;
			case 2:
				tl = new TapChi();
				break;
			case 3:
				tl = new Bao();
				break;
			default:
				System.out.println("Lua chon khong hop le!");
				return;
		}

		tl.nhapThongTin(sc);
		themTaiLieu(tl);
	}

	public void timKiemTheoMa(String maTaiLieu) {
		TaiLieu tl = danhSachTL.get(maTaiLieu);
		if (tl != null) {
			tl.hienThiThongTin();
		} else {
			System.out.println("Khong tim thay tai lieu voi ma: " + maTaiLieu);
		}
	}

	public void xoaTheoMa(String maTaiLieu) {
		if (danhSachTL.remove(maTaiLieu) != null) {
			System.out.println("Da xoa tai lieu voi ma: " + maTaiLieu);
		} else {
			System.out.println("Khong tim thay tai lieu voi ma: " + maTaiLieu);
		}
	}

    public void hienThiDanhSach() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hienThiDanhSach'");
    }

    public void nhapDanhSach(Scanner sc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nhapDanhSach'");
    }

}
