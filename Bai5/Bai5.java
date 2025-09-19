package BTJV.Bai5;

import java.util.Scanner;

import BTJV.Bai5.KhuPho;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc_123 = new Scanner(System.in);

		KhuPho qlkp_123 = new KhuPho();

		qlkp_123.nhapThongTin(sc_123);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_123.timKiemThongTin();
	}

}
