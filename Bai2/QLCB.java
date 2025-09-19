package BTJV.Bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private HashMap<String, CanBo> danhSachCanBo;

	public QLCB() {
		danhSachCanBo = new HashMap<>();
	}

	public void nhapDanhSach(Scanner sc) {
		System.out.print("Nhap so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin can bo thu " + (i + 1) + ":");
			System.out.print("\tNhap loai can bo (1 - Cong Nhan, 2 - Ky Su, 3 - Nhan Vien): ");
			int loaiCanBo = sc.nextInt();
			sc.nextLine();

			CanBo canBo = null;

			switch (loaiCanBo) {
			case 1:
				canBo = new CongNhan();
				break;
			case 2:
				canBo = new KySu();
				break;
			case 3:
				canBo = new NhanVien();
				break;
			default:
				System.out.println("Loai can bo khong hop le. Vui long thu lai.");
				i--;
				continue;
			}

			canBo.nhapThongTin(sc);
			danhSachCanBo.put(canBo.getHoTen(), canBo);
		}
	}

	public void timKiemCanBo(String name) {
		if (danhSachCanBo.containsKey(name)) {
			System.out.println("Thong tin can bo tim thay:");
			danhSachCanBo.get(name).hienThiThongTin();
		} else {
			System.out.println("Khong tim thay can bo voi ten: " + name);
		}
	}

	public HashMap<String, CanBo> getDanhSachCanBo() {
		return danhSachCanBo;
	}

	public void setDanhSachCanBo(HashMap<String, CanBo> danhSachCanBo) {
		this.danhSachCanBo = danhSachCanBo;
	}

	public void hienThiTatCaCanBo() {
		for (CanBo canBo : danhSachCanBo.values()) {
			canBo.hienThiThongTin();
			System.out.println("-----------------------");
		}
	}

	public void XoaCanBo(String name) {
		hienThiTatCaCanBo();
		if (danhSachCanBo.containsKey(name)) {
			danhSachCanBo.remove(name);
			System.out.println("Da xoa can bo voi ten: " + name);
		} else {
			System.out.println("Khong tim thay can bo voi ten: " + name);
		}
	}
}
