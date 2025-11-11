package thachche;

import java.util.Scanner;

public class vonglap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n= ");
		int i = sc.nextInt();

		int tong = 0;
		for (int n = 1; n <= i; n++) {
			tong += n;
		}

		System.out.println("Tong tu 1 den" + i + "la" + tong);

		sc.close();

	}

}
