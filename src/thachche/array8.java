package thachche;

import java.util.Scanner;

public class array8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu " + (i + 1) + "la :");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		System.out.println("Mang tang dan la : ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + "");
		}

		sc.close();

	}

}
