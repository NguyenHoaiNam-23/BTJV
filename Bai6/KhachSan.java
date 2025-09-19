package BTJV.Bai6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private HashMap<String, KhachTro> dsKhachTro_123;

	public KhachSan() {
		dsKhachTro_123 = new HashMap<String, KhachTro>();
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap so luong khach tro: ");
		int soLuong_123 = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < soLuong_123; i++) {
			System.out.println("Nhap thong tin khach tro thu " + (i + 1) + ":");
			KhachTro kt_123 = new KhachTro();
			kt_123.nhapThongTin(sc);
			dsKhachTro_123.put(kt_123.getCMND() + "", kt_123);
		}
	}

	public void hienThiThongTin() {
		System.out.println("Danh sach khach tro:");
		for (KhachTro kt_123 : dsKhachTro_123.values()) {
			kt_123.hienThiThongTin();
			System.out.println("--------------------");
		}
	}

	public void tinhTienThuePhong() {
		System.out.println("Tien thue phong cua moi khach tro:");
		for (KhachTro kt_123 : dsKhachTro_123.values()) {
			double tienThue_123 = kt_123.getSoNgayTro() * kt_123.getGiaPhong();
			System.out.println("Khach tro: " + kt_123.getHoTen() + ", CMND: " + kt_123.getCMND() + ", Tien thue: "
					+ tienThue_123);
		}
	}
}
