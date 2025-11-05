package thachche;

import java.util.Scanner;

public class array5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu " + (i + 1) + "la:");
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}

			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println("Gia tri lon nhat trong mang" + max);

		System.out.println("Gia tri nho nhat trong mang" + min);

		sc.close();

	}
}
