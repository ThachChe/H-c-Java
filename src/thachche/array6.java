package thachche;

import java.util.Scanner;

public class array6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap phan tu n= ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap so nguyen thu" + (i + 1) + " la: ");
			arr[i] = sc.nextInt();
		}

		int nho = 0;
		int lon = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				nho++;
//				(lấy giá trị trước của nho cộng thêm 1)

			} else {
				lon++;

			}
		}
		System.out.println("Co" + nho + "so nho hon 0");
		System.out.println("Co" + lon + "so lon hon 0");

		sc.close();

	}

}
