package thachche;

import java.util.Scanner;

public class tuoinguoidung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguoi: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Tuoi cua nguoi thu " + (i + 1) + "la: ");
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;

		}

		System.out.println("Dao tuoi nguoi dung");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
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
		System.out.println("Co" + young + " nguoi thuoc nhom duoi 18 tuoi ");
		System.out.println("Co" + middle_aged + " nguoi thuoc nhom (18;30) ");
		System.out.println("Co" + old + " nguoi thuoc nhom tren 30 tuoi ");

		sc.close();
	}

}
