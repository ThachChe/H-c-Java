package thachche;

import java.util.Scanner;

public class ToanTu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem Toan: ");
		float toan = sc.nextFloat();
		System.out.println("Nhap diem Ly: ");
		float ly = sc.nextFloat();
		System.out.println("Nhap diem Hoa: ");
		float hoa = sc.nextFloat();
		float tong = (toan + ly + hoa) / 3;
		System.out.println("Diem trung binh cua ban la: " + tong);

		if (tong >= 8) {
			System.out.println("Xep loai: Gioi");
		} else if (6.5 <= tong && tong < 8) {
			System.out.println("Xep loai: Kha");

		} else if (5 <= tong && tong < 6.5) {
			System.out.println("Xep loai: Trung binh");

		} else if (tong < 5) {
			System.out.println("Xep loai: Yeu");

		}

	}

}
