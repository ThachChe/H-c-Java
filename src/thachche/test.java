package thachche;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguoi: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Tuoi cua nguoi thu " + (i + 1) + "la: ");
			arr[i] = sc.nextInt();
		}

		int young = 0;
		int middle_aged = 0;
		int old = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 18) {
				young++;

			} else if (arr[i] > 18 && arr[i] < 30) {
				middle_aged++;

			} else {
				old++;

			}
		}
		System.out.println("So nguoi duoi 18 tuoi la: " + young);
		System.out.println("So nguoi tren 18 tuoi duoi 30 tuoi la: " + middle_aged);
		System.out.println("So nguoi tren 30 tuoi la: " + old);
	}
}