package thachche;

import java.util.Scanner;

public class array7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu" + (i + 1) + "la:");
			arr[i] = sc.nextInt();
		}

		System.out.println("Nhap gia tri x= ");
		int x = sc.nextInt();
		boolean found = false; // cờ để kiểm tra x có trong mảng không
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				System.out.println("x = " + arr[i] + "nam trong mang");
				found = true; // đánh dấu là đã tìm thấy
				break; // dừng vòng lặp, không cần tìm nữa
			}
		}

		if (!found) {
			System.out.println("x =" + x + "khong nam trong mang");
		}

		sc.close();
	}
}
