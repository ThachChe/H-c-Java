package thachche;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu" + (i + 1) + "la:");
			arr[i] = sc.nextInt();
		}

		System.out.println("Cac mang trong phan tu la: ");
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		sc.close();

	}

}
