package BTJV.Bai2;

import java.util.Scanner;
import java.util.Date;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec;

	public NhanVien() {

	}

	public NhanVien(String hoten, Date ngaySinh, String gioiTinh, String diaChi, String congViec) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap cong viec: ");
		congViec = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec);
	}
}
