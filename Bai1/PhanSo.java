package BTJV.Bai1;

import java.util.Scanner;

public class PhanSo {
	private int tu;
	private int mau;

	public PhanSo() {
		tu = 0;
		mau = 1;
	}

	public PhanSo(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}

	public void nhapPS(Scanner sc) {
		int a,b;

		do {
			System.out.println("Nhap vao tu so: ");
			a = sc.nextInt();

			System.out.println("Nhap vao mau so: ");
			b = sc.nextInt();

			// kiem tra
			if (b == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tu = a;
				mau = b;
			}
		} while (b == 0);
	}

	// ham hien thi
	public void hienThiPS() {
		if (tu * mau < 0) {
			System.out.println("\t-" + Math.abs(tu) + "/" + Math.abs(mau));
		} else {
			System.out.println("\t" + Math.abs(tu) + "/" + Math.abs(mau));
		}
	}

	// ham cong
	public PhanSo congPS(PhanSo ps2) {
		int a = tu * ps2.mau + ps2.tu * mau;
		int b = mau * ps2.mau;

		return new PhanSo(a, b);
	}

	// ham tru
	public PhanSo truPS(PhanSo ps2) {
		int a = tu * ps2.mau - ps2.tu * mau;
		int b = mau * ps2.mau;

		return new PhanSo(a, b);
	}

	// ham nhan
	public PhanSo nhanPS(PhanSo ps2) {
		int a = tu * ps2.tu;
		int b = mau * ps2.mau;

		return new PhanSo(a, b);
	}

	// ham chia
	public PhanSo chiaPS(PhanSo ps2) {
		int a = tu * ps2.mau;
		int b = mau * ps2.tu;

		return new PhanSo(a, b);
	}

	// ham tim uscln
	private int timUSCLN(int a, int b) {
		int r = a % b;

		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	public boolean kiemTraToiGian() {
		if (timUSCLN(tu, mau) == 1) {
			return true;
		}
		return false;
	}
	public void toiGianPS() {
		int x = timUSCLN(tu, mau);

		tu /= x;
		mau /= x;
	}
}
