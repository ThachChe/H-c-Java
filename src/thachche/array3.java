package thachche;

import java.util.Scanner;

public class array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu" + (i + 1) + "là: ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Tinh tong mang");
		int tong = 0;
		for (int i = 0; i < n; i++) {
			tong += arr[i];
		}
		System.out.println("Tong mang la: " + tong);

		System.out.println("Tinh trung binh mang");
		int tong_2 = 0;
		for (int i = 0; i < n; i++) {
			tong_2 += arr[i];
		}
		System.out.println("Tong mang la: " + tong_2 / n);

		sc.close();

	}

}
