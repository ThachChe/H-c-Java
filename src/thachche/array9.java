package thachche;

import java.util.Scanner;

public class array9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu " + (i + 1) + "la : ");
			arr[i] = sc.nextInt();
		}

		int max = 0;
		int value = 0;

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > max) {
				max = count;
				value = arr[i];

			}

		}

		System.out.println("Phan tu xuat hien nhieu nhat la: " + value + " (xuat hien " + max + " lan)");

		sc.close();

	}
}
