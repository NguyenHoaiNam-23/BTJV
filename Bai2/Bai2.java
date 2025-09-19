package BTJV.Bai2;

import java.util.*;

import BTJV.Bai2.QLCB;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc_123 = new Scanner(System.in);

		QLCB qlcb_123 = new QLCB();
		qlcb_123.nhapDanhSach(sc_123);
		System.out.print("Nhap ten can bo can tim: ");
		String name = sc_123.nextLine();
		qlcb_123.timKiemCanBo(name);
		sc_123.close();
	}

}
