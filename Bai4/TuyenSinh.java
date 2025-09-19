package BTJV.Bai4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class TuyenSinh {
	
	private HashMap<Integer, ThiSinh> dsThiSinh;
	
	public TuyenSinh() {
		dsThiSinh = new HashMap<>();
	}
	
	public void addThiSinh(ThiSinh thiSinh) {
		dsThiSinh.put(thiSinh.getSoBD(), thiSinh);
	}
	
	public void nhapDanhSach(Scanner sc) {
		System.out.print("Nhap so luong thi sinh: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin thi sinh thu " + (i + 1) + ":");
			System.out.print("\tChon khoi thi (A/B/C): ");
			String khoiThi = sc.nextLine().toUpperCase();
			ThiSinh thiSinh;
			switch (khoiThi) {
			case "A":
				thiSinh = new KhoiA();
				break;
			case "B":
				thiSinh = new KhoiB();
				break;
			case "C":
				thiSinh = new KhoiC();
				break;
			default:
				System.out.println("Khoi thi khong hop le. Vui long chon A, B hoac C.");
				i--;
				continue;
			}
			thiSinh.nhapThongTin(sc);
			dsThiSinh.put(thiSinh.getSoBD(), thiSinh);
		}
	}

	public void hienThiDanhSach() {
		for (ThiSinh thiSinh : dsThiSinh.values()) {
			thiSinh.hienThiThongTin();
			System.out.println("-------------------------");
		}
	}

	public void timKiemThiSinh(int soBD) {
		if (dsThiSinh.containsKey(soBD)) {
			System.out.println("Thong tin thi sinh co so bao danh " + soBD + ":");
			dsThiSinh.get(soBD).hienThiThongTin();
		} else {
			System.out.println("Khong tim thay thi sinh voi so bao danh " + soBD);
		}
	}

	public HashMap<Integer, ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(HashMap<Integer, ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}

}
