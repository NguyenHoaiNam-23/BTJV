package BTJV.Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen;
	protected Date ngaySinh;
	protected String CMND;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, Date ngaySinh, String CMND) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.CMND = CMND;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh = strToDate(strDate);
		System.out.print("\tNhap CMND: ");
		CMND = sc.nextLine();
	}

	private Date strToDate(String strDate) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return formatter.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(ngaySinh);
		System.out.println("\tNgay sinh: " + strDate);
		System.out.println("\tCMND: " + CMND);
	}

	// ham lay ra thong tin ho ten
	public String getHoTen() {
		return hoTen;
	}
	// ham lay ra thong tin CMND
	public String getCMND() {
		return CMND;
	}
	
}
