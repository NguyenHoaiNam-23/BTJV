package BTJV.Bai4;

import java.util.Scanner;

import BTJV.Bai4.TuyenSinh;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc_114 = new Scanner(System.in);

		TuyenSinh dsTuyenSinh_114 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh_114.nhapDanhSach(sc_114);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh_114.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh = sc_114.nextInt();
		sc_114.nextLine();

		dsTuyenSinh_114.timKiemThiSinh(soBaoDanh);

		sc_114.close();
	}

}
