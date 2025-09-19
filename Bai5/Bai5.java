package BTJV.Bai5;

import java.util.Scanner;

import BTJV.Bai5.KhuPho;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc_114 = new Scanner(System.in);

		KhuPho qlkp_114 = new KhuPho();

		qlkp_114.nhapThongTin(sc_114);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_114.timKiemThongTin();
	}

}
