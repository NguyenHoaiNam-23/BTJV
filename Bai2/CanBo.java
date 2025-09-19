package BTJV.Bai2;

// import java.sql.Date;
import java.util.Date;
import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen;
	private Date ngaySinh;
	private String gioiTinh;
	private String diaChi;

	public CanBo() {
	}

	public CanBo(String hoten, Date ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen = hoten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen = sc.nextLine();
		
		do {
			System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
			String ngaySinhStr = sc.nextLine();
			try {
				ngaySinh = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngaySinhStr);
				break;
			} catch (Exception e) {
				System.out.println("\tNgay sinh khong hop le. Vui long nhap lai.");
			}
		} while (true);


		System.out.print("\tNhap gioi tinh: ");
		gioiTinh = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tGioi tinh: " + gioiTinh);
		System.out.println("\tDia chi: " + diaChi);
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	
}
