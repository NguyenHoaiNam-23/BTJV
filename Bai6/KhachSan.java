package BTJV.Bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private HashMap<String, KhachTro> dsKhachTro_114;

	public KhachSan() {
		dsKhachTro_114 = new HashMap<String, KhachTro>();
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap so luong khach tro: ");
		int soLuong_114 = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < soLuong_114; i++) {
			System.out.println("Nhap thong tin khach tro thu " + (i + 1) + ":");
			KhachTro kt_114 = new KhachTro();
			kt_114.nhapThongTin(sc);
			dsKhachTro_114.put(kt_114.getCMND() + "", kt_114);
		}
	}

	public void hienThiThongTin() {
		System.out.println("Danh sach khach tro:");
		for (KhachTro kt_114 : dsKhachTro_114.values()) {
			kt_114.hienThiThongTin();
			System.out.println("--------------------");
		}
	}

	public void tinhTienThuePhong() {
		System.out.println("Tien thue phong cua moi khach tro:");
		for (KhachTro kt_114 : dsKhachTro_114.values()) {
			double tienThue_114 = kt_114.getSoNgayTro() * kt_114.getGiaPhong();
			System.out.println("Khach tro: " + kt_114.getHoTen() + ", CMND: " + kt_114.getCMND() + ", Tien thue: "
					+ tienThue_114);
		}
	}
}
