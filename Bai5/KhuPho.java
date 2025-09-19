package BTJV.Bai5;

import java.util.*;

public class KhuPho {

	private HashMap<Integer, HoDan> DS_123;
	
	public KhuPho() {
		DS_123 = new HashMap<>();
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap so ho dan trong khu pho: ");
		int soHoDan = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < soHoDan; i++) {
			System.out.println("Nhap thong tin cho ho dan thu " + (i + 1) + ":");
			HoDan hoDan = new HoDan();
			hoDan.nhapThongTin(sc);
			DS_123.put(hoDan.getSoNha(), hoDan);
		}
	}

	public HashMap<Integer, HoDan> getDS_123() {
		return DS_123;
	}

	public void hienThiThongTin() {
		System.out.println("Thong tin chi tiet cua tung ho dan trong khu pho:");
		for (Integer key : DS_123.keySet()) {
			System.out.println("Ho dan co ma so: " + key);
			DS_123.get(key).hienThiThongTin();
		}
	}

	public void timKiemThongTin() {
		ArrayList<HoDan> ketQua = new ArrayList<>();
		Calendar calNow = Calendar.getInstance();
		for (HoDan hoDan : DS_123.values()) {
			for (int i = 0; i < hoDan.getSoNguoi(); i++) {
				if (hoDan.getDS_123()[i] == null) continue;
				Date nSinh = hoDan.getDS_123()[i].getNgaySinh();
				if (nSinh == null) continue;

				Calendar calBirth = Calendar.getInstance();
				calBirth.setTime(nSinh);

				int tuoi = calNow.get(Calendar.YEAR) - calBirth.get(Calendar.YEAR);

				if (calNow.get(Calendar.DAY_OF_YEAR) < calBirth.get(Calendar.DAY_OF_YEAR)) {
					tuoi--;
				}

				if (tuoi >= 80) {
					ketQua.add(hoDan);
					break;
				}
			}
		}


		if (ketQua.isEmpty()) {
			System.out.println("Khong co ho dan nao co nguoi 80 tuoi.");
		} else {
			for (HoDan hoDan : ketQua) {
				hoDan.hienThiThongTin();
			}
		}
	}


}
