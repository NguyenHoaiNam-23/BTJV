package BTJV.Bai2;

import java.util.Scanner;
import java.util.Date;

public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao;

	public KySu() {

	}

	public KySu(String hoten, Date ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao);
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	
}
