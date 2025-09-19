package BTJV.Bai2;

import java.util.*;

import BTJV.Bai2.QLCB;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc_114 = new Scanner(System.in);

		QLCB qlcb_114 = new QLCB();
		qlcb_114.nhapDanhSach(sc_114);
		System.out.print("Nhap ten can bo can tim: ");
		String name = sc_114.nextLine();
		qlcb_114.timKiemCanBo(name);
		sc_114.close();
	}

}
