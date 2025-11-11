package thachche;

import java.util.Scanner;

public class array10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu " + (i + 1) + "la :");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}

		System.out.println("Mang dao nguoc la: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

		sc.close();

	}

}
