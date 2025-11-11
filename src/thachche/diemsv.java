package thachche;

import java.util.Scanner;

public class diemsv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So sinh vien n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so diem cua sinh vien" + (i + 1) + "la : ");
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

			else if (arr[i] > max) {
				max = arr[i];
			}

		}

		System.out.println("Diem cao nhat la: " + max);
		System.out.println("Diem thap nhat la: " + min);

		int tong = 0;
		for (int i = 0; i < n; i++) {
			tong += arr[i];

		}

		float tb = tong / n;

		System.out.println("Diem trung binh la: " + tb);

		int tong_2 = 0;
		int tong_3 = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 5) {
				tong_2++;

			} else {
				tong_3++;
			}

		}

		System.out.println("So sinh vien dau la: " + tong_2);
		System.out.println("So sinh vien rot la: " + tong_3);

		sc.close();

	}
}
