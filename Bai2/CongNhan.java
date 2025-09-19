package BTJV.Bai2;

import java.util.Scanner;
import java.util.Date;

public class CongNhan extends CanBo {
	private int bac;

	public CongNhan() {

	}

	public CongNhan(String hoten, Date ngaySinh, String gioiTinh, String diaChi, int bac) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.bac = bac;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap bac: ");
		bac = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac);
	}
}
