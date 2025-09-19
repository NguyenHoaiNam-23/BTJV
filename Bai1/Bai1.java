package BTJV.Bai1;

import java.util.*;

import BTJV.Bai1.PhanSo;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc_114=new Scanner(System.in);
		PhanSo ps1_114=new PhanSo();

		System.out.println("Nhap phan so: ");
		ps1_114.nhapPS(sc_114);
		System.out.println("Phan so vua nhap la: ");
		int luachon_114;
		do {System.out.println("=================MENU================");
			System.out.println("0. Thoat");
			System.out.println("1. Hien thi phan so");
			System.out.println("2. Kiem tra phan so toi gian hay chua");
			System.out.println("3. Toi gian phan so");
			System.out.println("4. Cong hai phan so");
			System.out.println("5. Tru hai phan so");
			System.out.println("6. Nhan hai phan so");
			System.out.println("7. Chia hai phan so");
			System.out.println("====================================");
			System.out.println("Nhap lua chon cua ban: ");
			luachon_114 = sc_114.nextInt();
			switch (luachon_114) {
				case 1:
					ps1_114.hienThiPS();
					break;
				case 2:
					
					if (ps1_114.kiemTraToiGian()) {
						System.out.println("Phan so da toi gian");
					} else {
						System.out.println("Phan so chua toi gian");
					}
					break;
				case 3:
					ps1_114.toiGianPS();
					System.out.println("Phan so sau khi toi gian la: ");
					ps1_114.hienThiPS();
					break;
				case 4:
					PhanSo ps2=new PhanSo();
					System.out.println("Nhap phan so thu hai: ");
					ps2.nhapPS(sc_114);
					System.out.println("Phan so thu nhat la: ");
					ps1_114.hienThiPS();
					System.out.println("Phan so thu hai la: ");
					ps2.hienThiPS();
					PhanSo psTong=ps1_114.congPS(ps2);
					System.out.println("Tong hai phan so la: ");
					psTong.hienThiPS();
					break;
				case 5:
					PhanSo ps3=new PhanSo();
					System.out.println("Nhap phan so thu hai: ");
					ps3.nhapPS(sc_114);
					System.out.println("Phan so thu nhat la: ");
					ps1_114.hienThiPS();
					System.out.println("Phan so thu hai la: ");
					ps3.hienThiPS();
					PhanSo psHieu=ps1_114.truPS(ps3);
					System.out.println("Hieu hai phan so la: ");
					psHieu.hienThiPS();
					break;
				case 6:
					PhanSo ps4=new PhanSo();
					System.out.println("Nhap phan so thu hai: ");
					ps4.nhapPS(sc_114);
					System.out.println("Phan so thu nhat la: ");
					ps1_114.hienThiPS();
					System.out.println("Phan so thu hai la: ");
					ps4.hienThiPS();
					PhanSo psTich=ps1_114.nhanPS(ps4);
					System.out.println("Tich hai phan so la: ");
					psTich.hienThiPS();
					break;
				case 7:
					PhanSo ps5=new PhanSo();
					System.out.println("Nhap phan so thu hai: ");
					ps5.nhapPS(sc_114);
					System.out.println("Phan so thu nhat la: ");
					ps1_114.hienThiPS();
					System.out.println("Phan so thu hai la: ");
					ps5.hienThiPS();
					PhanSo psThuong=ps1_114.chiaPS(ps5);
					System.out.println("Thuong hai phan so la: ");
					psThuong.hienThiPS();
					break;
				case 0:
					System.out.println("Thoat chuong trinh");
					break;
			} 
		}while (luachon_114 != 0);
		sc_114.close();
	}

}
