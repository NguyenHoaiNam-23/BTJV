package BTJV.Bai3;

import java.util.Scanner;

import BTJV.Bai3.QuanLySach;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLySach qls = new QuanLySach();
		qls.nhapDanhSach(sc);

		do {
			System.out.println("================ MENU ================");
			System.out.println("1. Hien thi thong tin tai lieu");
			System.out.println("2. Tim kiem tai lieu theo ma tai lieu");
			System.out.println("3. Xoa tai lieu theo ma tai lieu");
			System.out.println("4. Thoat");
			System.out.println("======================================");
			System.out.print("Chon chuc nang: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				qls.hienThiDanhSach();
				break;
			case 2:
				System.out.print("Nhap ma tai lieu can tim: ");
				String maTL = sc.nextLine();
				qls.timKiemTheoMa(maTL);
				break;
			case 3:
				System.out.print("Nhap ma tai lieu can xoa: ");
				String maTLXoa = sc.nextLine();
				qls.xoaTheoMa(maTLXoa);
				break;
			case 4:
				System.out.println("Thoat chuong trinh.");
				break;
			default:
				System.out.println("Lua chon khong hop le. Vui long chon lai.");
			}
		} while (true);
	}

}
