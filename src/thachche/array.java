package thachche;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu n= ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan thu tu " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		int tong = 0;
		for (int i = 0; i < n; i++) {
			tong += arr[i];
		}

		System.out.println("Tong so phan tu la: " + tong);

		sc.close();

	}

}
